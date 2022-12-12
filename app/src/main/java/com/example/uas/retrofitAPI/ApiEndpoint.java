package com.example.uas.retrofitAPI;

import com.example.uas.ContinentsModel;
import com.example.uas.CountriesModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("continents")
    Call<ContinentsModel> getDataContinents();

    @GET("countries")
    Call<CountriesModel> getDataCountries();
}
