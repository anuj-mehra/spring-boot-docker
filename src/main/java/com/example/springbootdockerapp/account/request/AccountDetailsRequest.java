package com.example.springbootdockerapp.account.request;

import java.io.Serializable;

public class AccountDetailsRequest implements Serializable {

    String searchAccountNumber;
    String region;

    public String getSearchAccountNumber() {
        return searchAccountNumber;
    }

    public void setSearchAccountNumber(String searchAccountNumber) {
        this.searchAccountNumber = searchAccountNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
