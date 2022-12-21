package com.example.uas.retrofitAPI;

import com.google.gson.annotations.SerializedName;

public class CountriesFlag {
    @SerializedName("_id")
    int id;

    @SerializedName("iso2")
    String iso2;

    @SerializedName("iso3")
    String iso3;

    @SerializedName("lat")
    int latitude;

    @SerializedName("long")
    int longitude;

    @SerializedName("flag")
    String flagsURL;

    public CountriesFlag(int id, String iso2, String iso3, int latitude, int longitude, String flagsURL) {
        this.id = id;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.latitude = latitude;
        this.longitude = longitude;
        this.flagsURL = flagsURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getFlagsURL() {
        return flagsURL;
    }

    public void setFlagsURL(String flagsURL) {
        this.flagsURL = flagsURL;
    }
}
