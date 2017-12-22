package com.zed.retrocloudantmvp.service;

import android.util.Log;

import com.cloudant.sync.event.Subscribe;
import com.cloudant.sync.event.notifications.ReplicationCompleted;
import com.cloudant.sync.event.notifications.ReplicationErrored;
import com.zed.retrocloudantmvp.views.launcher.LauncherContract;
import com.zed.retrocloudantmvp.views.launcher.LauncherPresenter;

import java.util.concurrent.CountDownLatch;

/**
 * Created by airfi on 09/12/17.
 */

public class ReplicationListener {

    CountDownLatch countDownLatch = null;
    LauncherContract.ILauncherPresenter iLauncherPresenter = null;


    public ReplicationListener(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        iLauncherPresenter = new LauncherPresenter();
    }

    @Subscribe
    public void complete(ReplicationCompleted event) {
        countDownLatch.countDown();
        Log.d("I am here", "completed");
        iLauncherPresenter.onReplicationCompleted();
        //  sEventBus.post(event);
    }

    @Subscribe
    public void error(ReplicationErrored event) {
        countDownLatch.countDown();
        Log.d("I am here", "error");
        iLauncherPresenter.onReplicationError();
    }
}
