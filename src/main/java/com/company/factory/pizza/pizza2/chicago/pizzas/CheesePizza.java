package com.company.factory.pizza.pizza2.chicago.pizzas;

import com.company.factory.pizza.pizza2.Pizza;
import com.company.factory.pizza.pizza2.PizzaIngridientFactory;

/**
 * Created by oskoblya on 15.06.2015.
 */
public class CheesePizza extends Pizza {
    PizzaIngridientFactory ingridientFactory;

    public CheesePizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
    }
}
