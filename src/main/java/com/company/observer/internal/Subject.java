package com.company.observer.internal;

/**
 * Created by oskoblya on 08.06.2015.
 */
public interface Subject {
    void registerObserver();

    void removeObserver();

    void notifyObservers();
}
