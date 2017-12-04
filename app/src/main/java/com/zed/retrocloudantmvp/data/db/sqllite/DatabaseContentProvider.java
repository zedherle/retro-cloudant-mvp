package com.zed.retrocloudantmvp.data.db.sqllite;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.zed.retrocloudantmvp.data.db.sqllite.table.Products;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public class DatabaseContentProvider extends ContentProvider{

    private static final String AUTHORITY = "com.zed.retrocloudantmvp.data.db.contentprovider";
    private static final UriMatcher sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);


    private static final int CODE_PRODUCT_TABLE = 10;
    private static final String PRODUCTS_BASE_PATH = "PRODUCTS_TABLE";
    public static final Uri PRODUCTS_TABLE_CONTENT_URI = Uri.parse("content://" + AUTHORITY
            .trim() + "/" + PRODUCTS_BASE_PATH);

    private DatabaseHelper databaseHelper = null;

    static
    {
        sURIMatcher.addURI(AUTHORITY,PRODUCTS_BASE_PATH,CODE_PRODUCT_TABLE);
    }

    @Override
    public boolean onCreate() {

        databaseHelper = DatabaseHelper.getInstance(getContext());
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {

        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        int uriType = sURIMatcher.match(uri);

        switch (uriType)
        {
            case CODE_PRODUCT_TABLE:
                checkColumns(projection, Products.getColumns());
                queryBuilder.setTables(Products.table_products);
                break;
            default:
                throw new UnsupportedOperationException("unsupported uri: " + uri);
        }

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor cursor = queryBuilder.query(db, projection, selection,
                selectionArgs, null, null, sortOrder);
        // make sure that potential listeners are getting notified
        cursor.setNotificationUri(getContext().getContentResolver(), uri);

        return cursor;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int uriType = sURIMatcher.match(uri);
        long returnId;
        String path;

        switch (uriType)
        {
            case CODE_PRODUCT_TABLE:
                returnId = db.insertOrThrow(Products.table_products,null,contentValues);
                path = PRODUCTS_BASE_PATH;
                break;
            default:
                throw new UnsupportedOperationException("unsupported uri: " + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);

        if (path != null)
            return Uri.parse(path.trim() + "/" + returnId);
        else
            return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int uriType = sURIMatcher.match(uri);
        int rowsDeleted;

        switch (uriType)
        {
            case CODE_PRODUCT_TABLE:
                rowsDeleted = db.delete(Products.table_products,selection,selectionArgs);
                break;
            default:
                throw new UnsupportedOperationException("unsupported uri: " + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);


        return rowsDeleted;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String selection, @Nullable String[] selectionArgs) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int uriType = sURIMatcher.match(uri);
        int rowsUpdated;

        switch (uriType)
        {
            case CODE_PRODUCT_TABLE:
                rowsUpdated = db.update(Products.table_products,contentValues,selection,selectionArgs);
                break;
            default:
                throw new UnsupportedOperationException("unsupported uri: " + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);

        return rowsUpdated;
    }

    @Override
    public int bulkInsert(@NonNull Uri uri, @NonNull ContentValues[] values) {

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        db.beginTransaction();

        int numOfRowsInserted = 0;
        try {
            numOfRowsInserted = bulkInsertPrivate(uri, values, db);
            db.setTransactionSuccessful();
        } catch (Exception e) {

        } finally {
            db.endTransaction();
        }

        return numOfRowsInserted;
    }

    private int bulkInsertPrivate(Uri uri, ContentValues[] values, SQLiteDatabase db) {

        int numOfRowsInserted = 0;
        SQLiteStatement insertStatement = null;
        HashMap<String, Integer> uniqueMap = new HashMap();
        int uriType = sURIMatcher.match(uri);
        switch (uriType)
        {
            case CODE_PRODUCT_TABLE:

                insertStatement = db.compileStatement("INSERT OR IGNORE INTO "+Products.table_products+"(" +
                        Products.rev.trim() + "," +
                        Products.barcode.trim() + "," +
                        Products.description.trim() + "," +
                        Products.category.trim() + "," +
                        Products.subcat.trim() + "," +
                        Products.manufacturer.trim() + "," +
                        Products.brand.trim() + "," +
                        Products.mrp.trim() + "," +
                        Products.created_by.trim() + "," +
                        Products.updated_by.trim() + ")"
                        .trim() + " values ".trim() + "(?,?,?,?,?,?,?,?,?,?)");

                for (ContentValues value : values) {
                    insertStatement.bindString(1, value.getAsString(Products.rev));
                    insertStatement.bindString(2, value.getAsString(Products.barcode));
                    insertStatement.bindString(3, value.getAsString(Products.description));
                    insertStatement.bindString(4, value.getAsString(Products.category));
                    insertStatement.bindString(5, value.getAsString(Products.subcat));
                    insertStatement.bindString(6, value.getAsString(Products.manufacturer));
                    insertStatement.bindString(7, value.getAsString(Products.brand));
                    insertStatement.bindDouble(8, value.getAsDouble(Products.mrp));
                    insertStatement.bindString(9, value.getAsString(Products.created_by));
                    insertStatement.bindString(10, value.getAsString(Products.updated_by));
                    insertStatement.execute();
                }
                numOfRowsInserted = values.length;
            return numOfRowsInserted;

            default:
                throw new UnsupportedOperationException("unsupported uri: " + uri);
        }

    }

    private void checkColumns(String[] projection, String[] available) {
        if (projection != null) {
            HashSet<String> requestedColumns = new HashSet<String>(Arrays.asList(projection));
            HashSet<String> availableColumns = new HashSet<String>(Arrays.asList(available));
            // check if all columns which are requested are available
           if (!availableColumns.containsAll(requestedColumns)) {
                throw new IllegalArgumentException("Unknown columns in projection");
            }
        }
    }
}
