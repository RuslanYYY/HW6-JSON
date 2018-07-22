package com.company.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RatePb {


    private String date;


    @SerializedName("exchangeRate")
    private List<ExchangeRate> myList;

    public String getDate() {
        return date;
    }

    public List<ExchangeRate> getMyList() {
        return myList;
    }

    @Override
    public String toString() {
        return "RatePb{" +
                "date='" + date + '\'' +
                ", myList=" + myList +
                '}';
    }
}
