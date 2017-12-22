package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

import com.cloudant.sync.documentstore.DocumentRevision;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public class Products {

    static final String DOC_TYPE = "z_items";
    private String barcode;
    private String description;
    private String category;
    private String subcat;
    private String manufacturer;
    private String brand;
    private double mrp;
    private String type = DOC_TYPE;
    private DocumentRevision revision;

    public static String getDocType() {
        return DOC_TYPE;
    }

    public static Products fromRevision(DocumentRevision rev) {

        Products products = new Products();
        products.revision = rev;

        Map<String, Object> map = rev.getBody().asMap();

        //if(map.containsKey("type") && map.get("type").equals(Products.DOC_TYPE)) {

        products.setBarcode((String) map.get("barcode"));
        products.setDescription((String) map.get("description"));
        products.setCategory((String) map.get("category"));
        products.setSubcat((String) map.get("subcat"));
        products.setManufacturer((String) map.get("manufacturer"));
        products.setBrand((String) map.get(("brand")));
        Object value = valueToStringOrEmpty(map, "mrp");
        products.setMrp(Double.parseDouble(value.toString()));
        products.setType((String) map.get("type"));

        return products;
        //}
        // return null;
    }

    private static Object valueToStringOrEmpty(Map<String, ?> map, String key) {
        Object value = map.get(key);
        return value == null ? 0 : value;
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

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DocumentRevision getRevision() {
        return revision;
    }

    public void setRevision(DocumentRevision revision) {
        this.revision = revision;
    }

    public Map<String, Object> asMap() {

        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put("barcode",barcode);
        map.put("description", description);
        map.put("category",category);
        map.put("subcat",subcat);
        map.put("manufacturer",manufacturer);
        map.put("brand",brand);
        map.put("mrp",mrp);
        map.put("type", type);
        return map;
    }


}
