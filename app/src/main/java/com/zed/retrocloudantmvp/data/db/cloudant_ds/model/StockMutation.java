
package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;
/**
 * Created by airfi on 06/12/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockMutation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("tablet_id")
    @Expose
    private String tabletId;
    @SerializedName("mutation_amount")
    @Expose
    private Integer mutationAmount;
    @SerializedName("crew")
    @Expose
    private String crew;
    @SerializedName("opening_stock")
    @Expose
    private Boolean openingStock;
    @SerializedName("fli")
    @Expose
    private Flight fli;
    @SerializedName("flight_key")
    @Expose
    private String flightKey;
    @SerializedName("mutation_id")
    @Expose
    private String mutationId;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("type")
    @Expose
    private String type;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTabletId() {
        return tabletId;
    }

    public void setTabletId(String tabletId) {
        this.tabletId = tabletId;
    }

    public Integer getMutationAmount() {
        return mutationAmount;
    }

    public void setMutationAmount(Integer mutationAmount) {
        this.mutationAmount = mutationAmount;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public Boolean getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(Boolean openingStock) {
        this.openingStock = openingStock;
    }

    public Flight getFli() {
        return fli;
    }

    public void setFli(Flight fli) {
        this.fli = fli;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    public String getMutationId() {
        return mutationId;
    }

    public void setMutationId(String mutationId) {
        this.mutationId = mutationId;
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

    public class Flight {

        @SerializedName("flight_number")
        @Expose
        private String flightNumber;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("origin")
        @Expose
        private String origin;
        @SerializedName("destination")
        @Expose
        private String destination;

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

    }

}