package com.zed.retrocloudantmvp.views.base;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public interface BaseContract {

    public interface IBaseView
    {
        void showProgress();

    }

    public interface IBasePresenter
    {
        void onCreate();
        void onDestroy();
    }

}
