package com.example.a20200320_02_pizzastorelist.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {

    private String storeName;
    private String logoUrl;
    private String phoneNum;

    public PizzaStore(String storeName, String logoUrl) {
        this.storeName = storeName;
        this.logoUrl = logoUrl;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
