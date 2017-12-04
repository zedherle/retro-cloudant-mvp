package com.zed.retrocloudantmvp.data.db.cloudant_ds;

import android.content.Context;
import android.util.Log;

import com.cloudant.sync.documentstore.ConflictException;
import com.cloudant.sync.documentstore.DocumentBodyFactory;
import com.cloudant.sync.documentstore.DocumentException;
import com.cloudant.sync.documentstore.DocumentNotFoundException;
import com.cloudant.sync.documentstore.DocumentRevision;
import com.cloudant.sync.documentstore.DocumentStore;
import com.cloudant.sync.documentstore.DocumentStoreException;
import com.cloudant.sync.documentstore.DocumentStoreNotOpenedException;
import com.cloudant.sync.event.Subscribe;
import com.cloudant.sync.event.notifications.ReplicationCompleted;
import com.cloudant.sync.event.notifications.ReplicationErrored;
import com.cloudant.sync.replication.Replicator;
import com.cloudant.sync.replication.ReplicatorBuilder;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;
import com.zed.retrocloudantmvp.views.main.MainPresenter;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CloudantHelper {

    private static final String LOG_TAG = "CloudantHelper";
    private static final String DOCUMENT_STORE_DIR = "data";
    private static final String DOCUMENT_STORE_NAME = "zed-items";

    private static final int CODE_DOC_TYPE_ITEM=10;

    private DocumentStore mDocumentStore;
    private Replicator mPushReplicator;
    private Replicator mPullReplicator;
    private final Context mContext;
    private MainPresenter mListener;


    public CloudantHelper(Context context) {
        this.mContext = context;
        File path = this.mContext.getApplicationContext().getDir(
                DOCUMENT_STORE_DIR,
                Context.MODE_PRIVATE
        );
        try {
            this.mDocumentStore = DocumentStore.getInstance(new File(path, DOCUMENT_STORE_NAME));
        } catch (DocumentStoreNotOpenedException e) {
            Log.e(LOG_TAG, "Unable to open DocumentStore", e);
        }
        Log.d(LOG_TAG, "The data store is created at " + path.getAbsolutePath());
    }

    public Object createDocument(int code,Object document) {

        DocumentRevision rev = new DocumentRevision();

        switch (code) {
            case CODE_DOC_TYPE_ITEM:
                rev.setBody(DocumentBodyFactory.create(((Products) document).asMap()));
                try {
                    DocumentRevision created = this.mDocumentStore.database().create(rev);
                    return ((Products) document).fromRevision(created);
                } catch (DocumentException de) {
                    return null;
                } catch (DocumentStoreException de) {
                    return null;
                }
            default:break;
        }

        return null;
    }

    public Object updateDocument(int code, Object document) throws ConflictException, DocumentStoreException {

        switch (code) {
            case CODE_DOC_TYPE_ITEM:
                DocumentRevision rev = ((Products) document).getRevision();
                rev.setBody(DocumentBodyFactory.create(((Products) document).asMap()));
                try {
                    DocumentRevision created = this.mDocumentStore.database().update(rev);
                    return ((Products) document).fromRevision(created);
                } catch (DocumentException de) {
                    return null;
                } catch (DocumentStoreException de) {
                    return null;
                }
            default:break;
        }

        return null;
    }

    public void deleteDocument(int code, Object document) throws ConflictException, DocumentNotFoundException, DocumentStoreException {

        switch (code) {
            case CODE_DOC_TYPE_ITEM:
                this.mDocumentStore.database().delete(((Products) document).getRevision());
                break;

            default:break;
        }

    }
    public List<Products> allProducts() throws DocumentStoreException {

                int nDocs = this.mDocumentStore.database().getDocumentCount();
                List<DocumentRevision> all = this.mDocumentStore.database().read(0, nDocs, true);
                List<Products> productsList = new ArrayList<Products>();

                for(DocumentRevision rev : all) {
                    Products product = Products.fromRevision(rev);
                    if (product != null) {
                        productsList.add(product);
                    }
                }
        Log.e("GET ALL PRODUCTS", " count "+nDocs);
                return productsList;
        }

    public long allDocumentCounts() throws DocumentStoreException {
        int nDocs = this.mDocumentStore.database().getDocumentCount();
        return  nDocs;
    }
        /*Replication Management */

    public void stopAllReplications() {
        if (this.mPullReplicator != null) {
            this.mPullReplicator.stop();
        }
        if (this.mPushReplicator != null) {
            this.mPushReplicator.stop();
        }
    }

    public void startPushReplication() {
        if (this.mPushReplicator != null) {
            this.mPushReplicator.start();
        } else {
            throw new RuntimeException("Push replication not set up correctly");
        }
    }

    public void startPullReplication() {
        if (this.mPullReplicator != null) {
            this.mPullReplicator.start();
        } else {
            throw new RuntimeException("Push replication not set up correctly");
        }
    }
    public void reloadReplicationSettings()
            throws URISyntaxException {

        this.stopAllReplications();
        URI uri = this.createServerURI();

        mPullReplicator = ReplicatorBuilder.pull().to(mDocumentStore).from(uri).build();
    //  mPushReplicator = ReplicatorBuilder.push().from(mDocumentStore).to(uri).build();
        // mPushReplicator.getEventBus().register(this);
       mPullReplicator.getEventBus().register(this);
       startPullReplication();
        Log.d(LOG_TAG, "Set up replicators for URI:" + uri.toString());
    }

    private URI createServerURI()
            throws URISyntaxException {

        String username = "2e6c5643-9e7b-4a80-9d39-0f7561f76b0d-bluemix";
        String dbName = "zed-items";
        String apiKey = "ceirlyardlenignigningeme";
        String apiSecret = "6f34f8af48da137c5d024d7fad7b60ed99d4411f";
        String host = username + ".cloudant.com";

        return new URI("https", apiKey + ":" + apiSecret, host, 443, "/" + dbName, null, null);
    }

    @Subscribe
    public void complete(ReplicationCompleted rc) {
        Log.e(LOG_TAG, "Replication Completed:" +rc);
        mListener.replicationCompleted();
    }
    @Subscribe
    public void error(ReplicationErrored re) {
        Log.e(LOG_TAG, "Replication error:", re.errorInfo);
        mListener.replicationFailed();
    }

    public void setReplicationListener(MainPresenter listener) {
        this.mListener = listener;
    }
}