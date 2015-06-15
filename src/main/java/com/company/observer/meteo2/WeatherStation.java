package com.company.observer.meteo2;

/**
 * Created by oskoblya on 08.06.2015.
 */
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData= new WeatherData();

        CurrentConditionDisplay  currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        HeatIndexDisplay  heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
