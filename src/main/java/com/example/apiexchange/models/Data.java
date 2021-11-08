package com.example.apiexchange.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private String created_on;
    private String unix_time;
    private String expiration_time_unix ;

    private Ticker ticker;
    private Market market;

    private String rate ;
    private String rate_id ;
    private Boolean allowed_historic_price_variance;
    private Boolean allowed_historic_price_age;

    public Data() {

    }

    public String getCreated_on() {
        return created_on;
    }

    public String getUnix_time() {
        return unix_time;
    }


    public String getExpiration_time_unix() {
        return expiration_time_unix;
    }


    public String getRate() {
        return rate;
    }


    public String getRate_id() {
        return rate_id;
    }


    public Boolean getAllowed_historic_price_variance() {
        return allowed_historic_price_variance;
    }


    public Boolean getAllowed_historic_price_age() {
        return allowed_historic_price_age;
    }


    public Ticker getTicker() {
        return ticker;
    }

    public Market getMarket() {
        return market;
    }


    @Override
    public String toString() {
        return "Data{" +
                "created_on='" + created_on + '\'' +
                ", unix_time='" + unix_time + '\'' +
                ", expiration_time_unix='" + expiration_time_unix + '\'' +
                ", ticker=" + ticker +
                ", market=" + market +
                ", rate='" + rate + '\'' +
                ", rate_id='" + rate_id + '\'' +
                ", allowed_historic_price_variance=" + allowed_historic_price_variance +
                ", allowed_historic_price_age=" + allowed_historic_price_age +
                '}';
    }
}
