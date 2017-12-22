package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

/**
 * Created by airfi on 06/12/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TabletMetadata {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("fk_specific_catalog_loaded")
    @Expose
    private Boolean fkSpecificCatalogLoaded;
    @SerializedName("tablet_id")
    @Expose
    private String tabletId;
    @SerializedName("logon_name")
    @Expose
    private String logonName;
    @SerializedName("final_battery_reading")
    @Expose
    private Integer finalBatteryReading;
    @SerializedName("flight_key")
    @Expose
    private String flightKey;
    @SerializedName("flight_leg_identifier")
    @Expose
    private FlightLegIdentifier flightLegIdentifier;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("flight_key_entry_mode")
    @Expose
    private String flightKeyEntryMode;
    @SerializedName("created_time")
    @Expose
    private String createdTime;
    @SerializedName("flight_end_date")
    @Expose
    private String flightEndDate;
    @SerializedName("flight_start_date")
    @Expose
    private String flightStartDate;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("initial_battery_reading")
    @Expose
    private Integer initialBatteryReading;

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

    public Boolean getFkSpecificCatalogLoaded() {
        return fkSpecificCatalogLoaded;
    }

    public void setFkSpecificCatalogLoaded(Boolean fkSpecificCatalogLoaded) {
        this.fkSpecificCatalogLoaded = fkSpecificCatalogLoaded;
    }

    public String getTabletId() {
        return tabletId;
    }

    public void setTabletId(String tabletId) {
        this.tabletId = tabletId;
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName;
    }

    public Integer getFinalBatteryReading() {
        return finalBatteryReading;
    }

    public void setFinalBatteryReading(Integer finalBatteryReading) {
        this.finalBatteryReading = finalBatteryReading;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
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

    public String getFlightKeyEntryMode() {
        return flightKeyEntryMode;
    }

    public void setFlightKeyEntryMode(String flightKeyEntryMode) {
        this.flightKeyEntryMode = flightKeyEntryMode;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getFlightEndDate() {
        return flightEndDate;
    }

    public void setFlightEndDate(String flightEndDate) {
        this.flightEndDate = flightEndDate;
    }

    public String getFlightStartDate() {
        return flightStartDate;
    }

    public void setFlightStartDate(String flightStartDate) {
        this.flightStartDate = flightStartDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInitialBatteryReading() {
        return initialBatteryReading;
    }

    public void setInitialBatteryReading(Integer initialBatteryReading) {
        this.initialBatteryReading = initialBatteryReading;
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
