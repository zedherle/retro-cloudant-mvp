package com.zed.retrocloudantmvp.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sanjay Herle on 30-11-2017.
 */

public class ItemsResponse {

    @SerializedName("total_rows")
    @Expose
    private Integer totalRows;
    @SerializedName("bookmark")
    @Expose
    private String bookmark;
    @SerializedName("rows")
    @Expose
    private List<Row> rows = null;

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public class Row {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("order")
        @Expose
        private List<Double> order = null;
        @SerializedName("fields")
        @Expose
        private Fields fields;
        @SerializedName("doc")
        @Expose
        private Doc doc;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Double> getOrder() {
            return order;
        }

        public void setOrder(List<Double> order) {
            this.order = order;
        }

        public Fields getFields() {
            return fields;
        }

        public void setFields(Fields fields) {
            this.fields = fields;
        }

        public Doc getDoc() {
            return doc;
        }

        public void setDoc(Doc doc) {
            this.doc = doc;
        }

        public class Doc {

            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("_rev")
            @Expose
            private String rev;
            @SerializedName("barcode")
            @Expose
            private String barcode;
            @SerializedName("description")
            @Expose
            private String description;
            @SerializedName("category")
            @Expose
            private String category;
            @SerializedName("subcat")
            @Expose
            private String subcat;
            @SerializedName("manufacturer")
            @Expose
            private String manufacturer;
            @SerializedName("brand")
            @Expose
            private String brand;
            @SerializedName("prod_mrp")
            @Expose
            private String prodMrp;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getRev() {
                return rev;
            }

            public void setRev(String rev) {
                this.rev = rev;
            }

            public String getBarcode() {
                return barcode;
            }

            public void setBarcode(String barcode) {
                this.barcode = barcode;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getSubcat() {
                return subcat;
            }

            public void setSubcat(String subcat) {
                this.subcat = subcat;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getProdMrp() {
                return prodMrp;
            }

            public void setProdMrp(String prodMrp) {
                this.prodMrp = prodMrp;
            }

        }
        public class Fields {


        }

    }

}