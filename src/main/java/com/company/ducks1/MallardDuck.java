package com.company.ducks1;

/**
 * Created by oskoblya on 03.06.2015.
 */
public class MallardDuck extends Duck implements Quackable, Flyable{
    public void fly() {

    }

    public void quack() {

    }

    @Override
    public void display() {
        System.out.println("Display Mallard Duck!");
    }
}
