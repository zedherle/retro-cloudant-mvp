package com.zed.retrocloudantmvp.data.network;

import com.zed.retrocloudantmvp.data.network.model.ItemsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Sanjay Herle on 29/11/17.
 */

public interface APIEndpointInterface {

    @Headers({
            "Content-type: application/json",
            "Authorization: Basic Y2Vpcmx5YXJkbGVuaWduaWduaW5nZW1lOjZmMzRmOGFmNDhkYTEzN2M1ZDAyNGQ3ZmFkN2I2MGVkOTlkNDQxMWY="
    })
    @GET("/zed-items/_design/zed/_search/searchAll?include_docs=true&q=barcode:8*%20AND%20brand:NES*&limit=10")
    Call<ItemsResponse> getItems();

    /*@GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);*/
}
