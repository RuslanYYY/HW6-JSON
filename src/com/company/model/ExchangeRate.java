package com.company.model;

import com.google.gson.annotations.SerializedName;

public class ExchangeRate {

    private String baseCurrency;
    private String currency;

    @SerializedName("saleRateNB")
    private double saleRateNb;
    private double purchaseRateNB;
    private double saleRate;
    private double purchaseRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public double getSaleRateNb() {
        return saleRateNb;
    }

    public double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public double getPurchaseRate() {
        return purchaseRate;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "baseCurrency='" + baseCurrency + '\'' +
                ", currency='" + currency + '\'' +
                ", saleRateNb=" + saleRateNb +
                ", purchaseRateNB=" + purchaseRateNB +
                ", saleRate=" + saleRate +
                ", purchaseRate=" + purchaseRate +
                '}';
    }
}
