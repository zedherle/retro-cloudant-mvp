package com.zed.retrocloudantmvp.data.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanjay Herle on 29/11/17.
 */

public class MultipleResource {

    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer perPage;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer totalPages;
    @SerializedName("data")
    public List<Datum> data = new ArrayList<>();

    public class Datum {

        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("year")
        public Integer year;
        @SerializedName("pantone_value")
        public String pantoneValue;

    }
}
