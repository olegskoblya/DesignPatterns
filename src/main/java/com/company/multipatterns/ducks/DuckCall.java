package com.company.multipatterns.ducks;



/**
 * Created by oskoblya on 27.07.2015.
 */
public class DuckCall implements Quackable {
    Observable observable;


    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
