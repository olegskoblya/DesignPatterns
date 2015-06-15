package com.company.observer.meteo3;

/**
 * Created by oskoblya on 09.06.2015.
 */
public class Meteo3Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(30f, 20f, 70f);
    }
}
