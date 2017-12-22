package com.zed.retrocloudantmvp.service;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.cloudant.sync.replication.Replicator;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.CloudantHelper;

import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * Created by airfi on 09/12/17.
 */

public class ReplicationJob extends Service {

    ArrayList<Replicator> replicators = null;
    private ReplicationTask replicationTask = null;
    private JobParameters mJobParameters;
    private Context context = null;
    private CloudantHelper cloudantHelper = null;

    public ReplicationJob() {

    }

//    public ReplicationJob(CloudantHelper cloudantHelper) {
//        this.cloudantHelper=cloudantHelper;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        doReplication();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void doReplication() {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks()
                .execute(new Runnable() {
                    @Override
                    public void run() {
                        // do some background work here.
                        try {

                            cloudantHelper = CloudantHelper.getInstance(getApplicationContext());
                            cloudantHelper.reloadReplicationSettings();
                            cloudantHelper.startPullReplication();

                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }

                    }
                });
    }

}
