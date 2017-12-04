package com.zed.retrocloudantmvp.data.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sanjay Herle on 29/11/17.
 */

public class CreateUserResponse {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;
}
