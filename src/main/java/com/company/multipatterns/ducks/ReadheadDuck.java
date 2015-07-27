package com.company.multipatterns.ducks;



/**
 * Created by oskoblya on 27.07.2015.
 */
public class ReadheadDuck implements Quackable {
    Observable observable;


    @Override
    public void quack() {
        System.out.println("Quack");
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

    public ReadheadDuck() {
        observable = new Observable(this);
    }
}
