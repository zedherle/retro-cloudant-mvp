package com.zed.retrocloudantmvp.views.launcher;

import android.content.Context;
import android.util.Log;

import com.cloudant.sync.event.Subscribe;
import com.cloudant.sync.event.notifications.ReplicationCompleted;
import com.cloudant.sync.event.notifications.ReplicationErrored;
import com.cloudant.sync.replication.Replicator;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.CloudantHelper;
import com.zed.retrocloudantmvp.service.ReplicationJob;

import java.util.ArrayList;


/**
 * Created by airfi on 09/12/17.
 */

public class LauncherPresenter implements LauncherContract.ILauncherPresenter {

    Context context = null;
    LauncherContract.ILauncherView iLauncherView = null;
    ReplicationJob replicationJob = null;
    ArrayList<Replicator> myReps = null;
    CloudantHelper cloudantHelper = null;
    //CountDownLatch countDownLatch = null;


    public LauncherPresenter(Context context, LauncherContract.ILauncherView iLauncherView) {
        this.context = context;
        this.iLauncherView = iLauncherView;
    }

    public LauncherPresenter() {


    }

    @Override
    public void onCreate() {

        cloudantHelper = CloudantHelper.getInstance(context);
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void launchReplicationService() {

        iLauncherView.onReplicationSetup();
    }

    @Override
    public void onReplicationCompleted() {
        iLauncherView.openLoginPage();
    }

    @Override
    public void onReplicationError() {

    }

    @Subscribe
    public void complete(ReplicationCompleted event) {
        // countDownLatch.countDown();
        Log.d("I am here at presenter", "completed");

        //  sEventBus.post(event);
    }

    @Subscribe
    public void error(ReplicationErrored event) {
        // countDownLatch.countDown();
        Log.d("I am here at presenter", "error");

    }

}
