package com.company.observer.meteo;

import java.util.List;

/**
 * Created by oskoblya on 08.06.2015.
 */
public abstract class AbstractWeatherSubject implements WeatherSubject{
    List<WeatherObserver> observers;
}
