package com.company.observer.meteo2;

/**
 * Created by oskoblya on 08.06.2015.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
