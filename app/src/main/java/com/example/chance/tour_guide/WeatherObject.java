package com.example.chance.tour_guide;

/**
 * Created by chance on 7/31/17.
 */

public class WeatherObject {
    private String cityName;
    private String weatherStatus;
    private int weatherIcon;
    private int temperature;

    public WeatherObject(String cityName, String weatherStatus, int temperature, int weatherIcon) {
        this.cityName = cityName;
        this.weatherStatus = weatherStatus;
        this.weatherIcon = weatherIcon;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
