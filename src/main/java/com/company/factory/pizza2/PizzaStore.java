package com.company.factory.pizza2;

/**
 * Created by oleg on 16.06.15.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);


    protected Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
