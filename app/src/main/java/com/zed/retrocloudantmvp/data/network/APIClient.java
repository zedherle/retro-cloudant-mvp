package com.zed.retrocloudantmvp.data.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sanjay Herle on 29/01/17
 */

public class APIClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://2e6c5643-9e7b-4a80-9d39-0f7561f76b0d-bluemix.cloudant.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        //   "https://reqres.in"

        return retrofit;
    }

}
