package com.company.multipatterns.ducks;



/**
 * Created by oskoblya on 27.07.2015.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
