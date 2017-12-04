package com.zed.retrocloudantmvp.data.db.sqllite.table;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public class Products {

    //columns
    private static String id = "_id";
    public static String rev = "_rev";
    public static String barcode = "barcode";
    public static String description = "description";
    public static String category ="category";
    public static String subcat="subcat";
    public static String manufacturer="manufacture";
    public static String brand="brand";
    public static String mrp="mrp";

    private static String created_on="created_on";
    private static String updated_on="updated_on";

    public static String created_by="created_by";
    public static String updated_by="updated_by";

    //table
    public static String table_products = "zed_products";

    //table creation query
    public static final String CREATE_PRODUCT_TABLE =
            "CREATE TABLE " + table_products + "("
                    + id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + rev + " INTEGER, "
                    + barcode + " TEXT, "
                    + description + " TEXT, "
                    + category + " TEXT, "
                    + subcat + " TEXT, "
                    + manufacturer + " TEXT, "
                    + brand + " TEXT, "
                    + mrp + " NUMERIC(10,2), "
                    + created_by + " TEXT, "
                    + updated_by + " TEXT, "
                    + created_on + " DATETIME DEFAULT (datetime('now','localtime')), "
                    + updated_on + " DATETIME DEFAULT (datetime('now','localtime'))" + ")";


    public static String[] getColumns()
    {
        String [] columns = {id, rev, barcode,description,category,subcat,manufacturer,brand,mrp,created_by,updated_by,created_on,updated_on};
        return columns;
    }
}
