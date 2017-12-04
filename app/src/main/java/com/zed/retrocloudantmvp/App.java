package com.zed.retrocloudantmvp;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public class App extends Application{


    public static Context appContext = null;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("APP","Created");
//        appContext = this.getApplicationContext();
        Log.d("APP",""+appContext);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
