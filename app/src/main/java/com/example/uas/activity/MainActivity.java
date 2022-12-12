package com.example.uas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.uas.ContinentsModel;
import com.example.uas.R;
import com.example.uas.retrofitAPI.ApiEndpoint;
import com.example.uas.retrofitAPI.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG="MainActivity";
    private ArrayList<ContinentsModel>modelArrayList;
    private ApiEndpoint apiEndpoint;
    private ListView lv;
    private String BaseURL="https://disease.sh/v3/covid-19";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
//        METHOD GET DATA
        getDataFromApi();
    }

    private void getDataFromApi(){
        ApiService.endpoint().getDataContinents()
                .enqueue(new Callback<ContinentsModel>() {
                    @Override
                    public void onResponse(Call<ContinentsModel> call, Response<ContinentsModel> response) {
                        if(response.isSuccessful()){
                            List<ContinentsModel.covidContinent> results=response.body().getCovidcontinent();
                            Log.d(TAG,results.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<ContinentsModel> call, Throwable t) {
                        Log.d(TAG,t.toString());
                    }
                });
    }
}