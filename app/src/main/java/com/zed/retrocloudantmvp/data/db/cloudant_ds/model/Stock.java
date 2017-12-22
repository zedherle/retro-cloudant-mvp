package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

/**
 * Created by airfi on 06/12/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Stock {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("last_updated_date")
    @Expose
    private String lastUpdatedDate;
    @SerializedName("stocks")
    @Expose
    private List<StockDetails> stocks = null;
    @SerializedName("flight_key")
    @Expose
    private String flightKey;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("flight_number")
    @Expose
    private String flightNumber;

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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public List<StockDetails> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockDetails> stocks) {
        this.stocks = stocks;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public class StockDetails {

        @SerializedName("product_id")
        @Expose
        private String productId;
        @SerializedName("barset_key")
        @Expose
        private Integer barsetKey;
        @SerializedName("current_stock")
        @Expose
        private Integer currentStock;
        @SerializedName("drawer_id")
        @Expose
        private String drawerId;
        @SerializedName("drawer_key")
        @Expose
        private Integer drawerKey;
        @SerializedName("opening_stock")
        @Expose
        private Integer openingStock;
        @SerializedName("trolley_id")
        @Expose
        private String trolleyId;
        @SerializedName("trolley_key")
        @Expose
        private Integer trolleyKey;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public Integer getBarsetKey() {
            return barsetKey;
        }

        public void setBarsetKey(Integer barsetKey) {
            this.barsetKey = barsetKey;
        }

        public Integer getCurrentStock() {
            return currentStock;
        }

        public void setCurrentStock(Integer currentStock) {
            this.currentStock = currentStock;
        }

        public String getDrawerId() {
            return drawerId;
        }

        public void setDrawerId(String drawerId) {
            this.drawerId = drawerId;
        }

        public Integer getDrawerKey() {
            return drawerKey;
        }

        public void setDrawerKey(Integer drawerKey) {
            this.drawerKey = drawerKey;
        }

        public Integer getOpeningStock() {
            return openingStock;
        }

        public void setOpeningStock(Integer openingStock) {
            this.openingStock = openingStock;
        }

        public String getTrolleyId() {
            return trolleyId;
        }

        public void setTrolleyId(String trolleyId) {
            this.trolleyId = trolleyId;
        }

        public Integer getTrolleyKey() {
            return trolleyKey;
        }

        public void setTrolleyKey(Integer trolleyKey) {
            this.trolleyKey = trolleyKey;
        }

    }


}