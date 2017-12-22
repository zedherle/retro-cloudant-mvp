package com.zed.retrocloudantmvp.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.zed.retrocloudantmvp.data.db.cloudant_ds.CloudantHelper;
import com.zed.retrocloudantmvp.views.launcher.LauncherPresenter;

import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by airfi on 09/12/17.
 */

public class ReplicationTask extends AsyncTask<Void, Void, Void> {

    CloudantHelper cloudantHelper = null;

    Context context = null;
    CountDownLatch countDownLatch = null;
    LauncherPresenter replicationListener = null;
    ProgressDialog progressDialog = null;

    public ReplicationTask(Context context) {
        this.context = context;
    }

    public ReplicationTask(Context context, LauncherPresenter launcherPresenter) {
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Replication Job");
        progressDialog.setMessage("Replication in progress. Please wait !!");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        progressDialog.cancel();

    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected Void doInBackground(Void... voids) {

        try {

            countDownLatch = new CountDownLatch(2);
            cloudantHelper = CloudantHelper.getInstance(context);
            cloudantHelper.reloadReplicationSettings(replicationListener, countDownLatch);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return null;
    }


}
