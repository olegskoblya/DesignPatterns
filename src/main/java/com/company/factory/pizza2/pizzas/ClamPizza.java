package com.company.factory.pizza2.pizzas;

import com.company.factory.pizza2.Pizza;
import com.company.factory.pizza2.PizzaIngridientFactory;

/**
 * Created by oleg on 16.06.15.
 */
public class ClamPizza extends Pizza {
    PizzaIngridientFactory ingridientFactory;

    public ClamPizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clams = ingridientFactory.createClam();
    }
}
