package com.company.strategy.ducks1;

/**
 * Created by oskoblya on 03.06.2015.
 */
public class RedheadDuck extends Duck implements Flyable, Quackable{
    public void fly() {

    }

    public void quack() {

    }

    @Override
    public void display() {
        System.out.println("Display Redhead Duck!");
    }
}
