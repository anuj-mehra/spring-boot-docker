package com.example.springbootdockerapp.account.response;

import java.io.Serializable;

public class AccountDetailsResponse implements Serializable {

    String searchAccountNumber;
    String accountNumber;
    String accountKey;

    public AccountDetailsResponse(){

    }
    public AccountDetailsResponse(String searchAccountNumber, String accountNumber, String accountKey){
        this.searchAccountNumber = searchAccountNumber;
        this.accountNumber = accountNumber;
        this.accountKey = accountKey;
    }
    public String getSearchAccountNumber() {
        return searchAccountNumber;
    }

    public void setSearchAccountNumber(String searchAccountNumber) {
        this.searchAccountNumber = searchAccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }
}
