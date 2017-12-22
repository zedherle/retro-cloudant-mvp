package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by airfi on 06/12/17.
 */

public class FlightLeg {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("tablet_id")
    @Expose
    private String tabletId;
    @SerializedName("flight_metadata")
    @Expose
    private FlightMetadata flightMetadata;
    @SerializedName("flight_leg_identifier")
    @Expose
    private FlightLegIdentifier flightLegIdentifier;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("employee_identifier")
    @Expose
    private String employeeIdentifier;
    @SerializedName("subscription_identifier")
    @Expose
    private String subscriptionIdentifier;
    @SerializedName("last_login_time")
    @Expose
    private String lastLoginTime;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("additional_data")
    @Expose
    private AdditionalData additionalData;
    @SerializedName("aircraft_registration")
    @Expose
    private String aircraftRegistration;

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

    public String getTabletId() {
        return tabletId;
    }

    public void setTabletId(String tabletId) {
        this.tabletId = tabletId;
    }

    public FlightMetadata getFlightMetadata() {
        return flightMetadata;
    }

    public void setFlightMetadata(FlightMetadata flightMetadata) {
        this.flightMetadata = flightMetadata;
    }

    public FlightLegIdentifier getFlightLegIdentifier() {
        return flightLegIdentifier;
    }

    public void setFlightLegIdentifier(FlightLegIdentifier flightLegIdentifier) {
        this.flightLegIdentifier = flightLegIdentifier;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public String getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    public void setEmployeeIdentifier(String employeeIdentifier) {
        this.employeeIdentifier = employeeIdentifier;
    }

    public String getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    public void setSubscriptionIdentifier(String subscriptionIdentifier) {
        this.subscriptionIdentifier = subscriptionIdentifier;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    public class AdditionalData {

        @SerializedName("forms")
        @Expose
        private Integer forms;
        @SerializedName("purchases")
        @Expose
        private Integer purchases;
        @SerializedName("refunds")
        @Expose
        private Integer refunds;
        @SerializedName("total_transactions")
        @Expose
        private Integer totalTransactions;

        public Integer getForms() {
            return forms;
        }

        public void setForms(Integer forms) {
            this.forms = forms;
        }

        public Integer getPurchases() {
            return purchases;
        }

        public void setPurchases(Integer purchases) {
            this.purchases = purchases;
        }

        public Integer getRefunds() {
            return refunds;
        }

        public void setRefunds(Integer refunds) {
            this.refunds = refunds;
        }

        public Integer getTotalTransactions() {
            return totalTransactions;
        }

        public void setTotalTransactions(Integer totalTransactions) {
            this.totalTransactions = totalTransactions;
        }

    }

    public class FlightMetadata {

        @SerializedName("flight_key")
        @Expose
        private String flightKey;

        public String getFlightKey() {
            return flightKey;
        }

        public void setFlightKey(String flightKey) {
            this.flightKey = flightKey;
        }

    }

    public class FlightLegIdentifier {

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



