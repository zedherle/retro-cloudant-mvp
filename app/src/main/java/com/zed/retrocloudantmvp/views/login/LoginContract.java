package com.zed.retrocloudantmvp.views.login;

import com.zed.retrocloudantmvp.views.base.BaseContract;

/**
 * Created by airfi on 08/12/17.
 */

public interface LoginContract {

    interface ILoginView extends BaseContract.IBaseView {

        void openMainPage();

        void onFailure();

    }

    interface ILoginPresenter extends BaseContract.IBasePresenter {


        void doAuth(String username, String password);

    }
}
