package com.zed.retrocloudantmvp.views.login;

import android.content.Context;

/**
 * Created by airfi on 08/12/17.
 */

public class LoginPresenter implements LoginContract.ILoginPresenter {

    Context context = null;
    LoginContract.ILoginView iLoginView = null;

    public LoginPresenter(Context context, LoginContract.ILoginView iLoginView) {
        this.context = context;
        this.iLoginView = iLoginView;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void doAuth(String username, String password) {

        if (username.equals("admin") && password.equals("admin")) {
            iLoginView.openMainPage();
        } else {
            iLoginView.onFailure();
        }
    }
}
