package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

/**
 * Created by airfi on 06/12/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Product {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("company_code")
    @Expose
    private String companyCode;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("menus")
    @Expose
    private List<String> menus = null;
    @SerializedName("catalog")
    @Expose
    private String catalog;
    @SerializedName("discounted")
    @Expose
    private Boolean discounted;
    @SerializedName("open_amount")
    @Expose
    private Boolean openAmount;
    @SerializedName("raw_price")
    @Expose
    private Double rawPrice;
    @SerializedName("default_sort_order")
    @Expose
    private Integer defaultSortOrder;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("long_description")
    @Expose
    private String longDescription;
    @SerializedName("currency_symbol")
    @Expose
    private String currencySymbol;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("complementary_allowed")
    @Expose
    private Boolean complementaryAllowed;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("product_without_stock")
    @Expose
    private Boolean productWithoutStock;
    @SerializedName("commercial_prices")
    @Expose
    private List<CommercialPrice> commercialPrices = null;

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

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Boolean getDiscounted() {
        return discounted;
    }

    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
    }

    public Boolean getOpenAmount() {
        return openAmount;
    }

    public void setOpenAmount(Boolean openAmount) {
        this.openAmount = openAmount;
    }

    public Double getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(Double rawPrice) {
        this.rawPrice = rawPrice;
    }

    public Integer getDefaultSortOrder() {
        return defaultSortOrder;
    }

    public void setDefaultSortOrder(Integer defaultSortOrder) {
        this.defaultSortOrder = defaultSortOrder;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Boolean getComplementaryAllowed() {
        return complementaryAllowed;
    }

    public void setComplementaryAllowed(Boolean complementaryAllowed) {
        this.complementaryAllowed = complementaryAllowed;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getProductWithoutStock() {
        return productWithoutStock;
    }

    public void setProductWithoutStock(Boolean productWithoutStock) {
        this.productWithoutStock = productWithoutStock;
    }

    public List<CommercialPrice> getCommercialPrices() {
        return commercialPrices;
    }

    public void setCommercialPrices(List<CommercialPrice> commercialPrices) {
        this.commercialPrices = commercialPrices;
    }


    public class CommercialPrice {

        @SerializedName("currency")
        @Expose
        private Currency currency;
        @SerializedName("price")
        @Expose
        private Double price;

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

    }


    public class Currency {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("symbol")
        @Expose
        private String symbol;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

    }


}