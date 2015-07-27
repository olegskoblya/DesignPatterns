package com.company.multipatterns.ducks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
   // Observable observable;

    public Flock() {
        //observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            //quacker.notifyObservers();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable: quackers) {
            quackable.registerObserver(observer);
        }

    }

    @Override
    public void notifyObservers() {
        //observable.notifyObservers();
    }
}
