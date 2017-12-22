package com.zed.retrocloudantmvp.views.launcher;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.service.ReplicationJob;
import com.zed.retrocloudantmvp.views.login.LoginActivity;

public class LauncherActivity extends AppCompatActivity implements LauncherContract.ILauncherView {

    private static final int MY_JOB_ID = 0;
    LauncherContract.ILauncherPresenter iLauncherPresenter = null;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        iLauncherPresenter = new LauncherPresenter(this, this);
        iLauncherPresenter.onCreate();
        iLauncherPresenter.launchReplicationService();

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void openLoginPage() {

        startActivity(new Intent(this, LoginActivity.class));
    }

    @Override
    public void onReplicationSetup() {

        startService(new Intent(this, ReplicationJob.class));
        startActivity(new Intent(this, LoginActivity.class));

    }
}
