package com.example.uas.retrofitAPI;

import com.google.gson.annotations.SerializedName;

public class CountriesResult {

    @SerializedName("flag")
    private String flag;

    @SerializedName("country")
    String country;

    @SerializedName("cases")
    int cases;

    @SerializedName("deaths")
    int deaths;

    @SerializedName("recovered")
    int recovered;

    public CountriesResult(String flag, String country, int cases, int deaths, int recovered) {
        this.flag=flag;
        this.country = country;
        this.cases = cases;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }
}
