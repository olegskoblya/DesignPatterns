package com.company.exercises.observer;

import com.company.observer.meteo3.DisplayElement;
import com.company.observer.meteo3.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by oskoblya on 09.06.2015.
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;

    public void display() {
        //display code here
    }

    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = this.currentPressure;
            currentPressure = weatherData.getPressure();

        }
    }
}
