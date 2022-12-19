package com.example.uas.retrofitAPI;

public class CountriesResponse {
    private CountriesResult[] continent;

    public CountriesResult[] getContinent() {
        return continent;
    }

    public void setContinent(CountriesResult[] continent) {
        this.continent = continent;
    }
}
