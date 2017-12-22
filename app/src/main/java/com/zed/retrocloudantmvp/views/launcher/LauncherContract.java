package com.zed.retrocloudantmvp.views.launcher;

import com.zed.retrocloudantmvp.views.base.BaseContract;

/**
 * Created by airfi on 09/12/17.
 */

public interface LauncherContract {

    interface ILauncherView extends BaseContract.IBaseView {

        void openLoginPage();

        void onReplicationSetup();


    }

    interface ILauncherPresenter extends BaseContract.IBasePresenter {

        void launchReplicationService();

        void onReplicationCompleted();

        void onReplicationError();


    }
}
