package com.example.chiriku.sunshineproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<WeatherModel> weatherModelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WeatherModel weatherModel = new WeatherModel();
        recyclerView = findViewById(R.id.recyler_view_container);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerViewAdapter(weatherModelList));

        for (int i=0; i<20;i++) {
            weatherModel.setDateDay("Today");
            weatherModel.setResId(1);
            weatherModel.setTempHigh("30");
            weatherModel.setTempLow("25");
            weatherModel.setWeatherInfo("Thunder");

            weatherModelList.add(weatherModel);
        }

    }
}
