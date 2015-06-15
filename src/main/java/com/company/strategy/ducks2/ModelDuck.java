package com.company.strategy.ducks2;

/**
 * Created by oskoblya on 04.06.2015.
 */
public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
