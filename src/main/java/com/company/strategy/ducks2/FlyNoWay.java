package com.company.strategy.ducks2;

/**
 * Created by oskoblya on 03.06.2015.
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
