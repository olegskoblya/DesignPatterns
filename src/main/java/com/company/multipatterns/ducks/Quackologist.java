package com.company.multipatterns.ducks;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
