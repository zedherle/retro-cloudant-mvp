package com.zed.retrocloudantmvp.views.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.views.main.MainActivity;

/**
 * Created by airfi on 08/12/17.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.ILoginView {

    EditText etUsername = null;
    EditText etPassword = null;

    Button btSubmit = null;

    String username = null;
    String password = null;

    LoginContract.ILoginPresenter loginPresenter = null;

    Intent mainActivityIntent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.input_email);
        etPassword = (EditText) findViewById(R.id.input_password);
        btSubmit = (Button) findViewById(R.id.btn_login);


        loginPresenter = new LoginPresenter(getApplicationContext(), this);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                Log.d("username", "" + username);
                Log.d("password", "" + password);

                loginPresenter.doAuth(username.trim(), password.trim());
            }
        });

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void openMainPage() {

        mainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(mainActivityIntent);

    }

    @Override
    public void onFailure() {

        Toast.makeText(getApplicationContext(), "Sorry, Invalid crdentials", Toast.LENGTH_LONG).show();
    }
}
