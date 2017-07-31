package com.example.chance.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Weather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ArrayList<Object> list = new ArrayList<>();
        //String cityName, String weatherStatus, int weatherIcon, double temperature
        list.add(new WeatherObject(getString(R.string.riyadh), getString(R.string.sunny), 43, R.mipmap.ic_sunny));
        list.add(new WeatherObject(getString(R.string.hafr), getString(R.string.sunny), 46, R.mipmap.ic_sunny));
        list.add(new WeatherObject(getString(R.string.khamis), getString(R.string.partly_cloudy), 29, R.mipmap.ic_cloudy));

        ListAdapter adapter = new ListAdapter(this, list);
        ListView rootView = (ListView) findViewById(R.id.weather_list_view);
        rootView.setAdapter(adapter);


    }
}
