package com.example.testTask.model;

public class Item {
    private  String itemType;
    private  String priceFrom;
    private  String priceTo;
    private  String getBrand;

    public Item setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public Item setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
        return this;
    }

    public Item setPriceTo(String priceTo) {
        this.priceTo = priceTo;
        return this;
    }

    public Item setGetBrand(String getBrand) {
        this.getBrand = getBrand;
        return this;
    }

    public String getItemType() {
        return itemType;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public String getGetBrand() {
        return getBrand;
    }
}
