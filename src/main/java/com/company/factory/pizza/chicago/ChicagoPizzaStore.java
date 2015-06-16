package com.company.factory.pizza.chicago;

import com.company.factory.pizza.Pizza;
import com.company.factory.pizza.PizzaStore;

/**
 * Created by oleg on 14.06.15.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese": pizza = new ChicagoStyleCheesePizza();
                break;
            case "veggie": pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam": pizza = new ChicagoStyleClamPizza();
                break;
            case "pepperoni": pizza = new ChicagoStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
