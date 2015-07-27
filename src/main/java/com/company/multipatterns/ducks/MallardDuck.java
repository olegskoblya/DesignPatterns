package com.company.multipatterns.ducks;



/**
 * Created by oskoblya on 27.07.2015.
 */
public class MallardDuck implements Quackable {
    Observable observable;


    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
}
