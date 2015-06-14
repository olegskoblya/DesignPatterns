package com.company.factory.pizza.newyork;

import com.company.factory.pizza.Pizza;
import com.company.factory.pizza.PizzaStore;

/**
 * Created by oleg on 14.06.15.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese": pizza = new NYStyleCheesePizza();
                break;
            case "veggie": pizza = new NYStyleVeggiePizza();
                break;
            case "clam": pizza = new NYStyleClamPizza();
                break;
            case "pepperoni": pizza = new NYStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
