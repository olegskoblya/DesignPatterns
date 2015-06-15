package com.company.observer.meteo;

/**
 * Created by oskoblya on 08.06.2015.
 */
public interface WeatherSubject {
    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();
}
