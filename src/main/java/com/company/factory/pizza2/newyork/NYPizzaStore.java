package com.company.factory.pizza2.newyork;

import com.company.factory.pizza2.Pizza;
import com.company.factory.pizza2.PizzaIngridientFactory;
import com.company.factory.pizza2.PizzaStore;
import com.company.factory.pizza2.pizzas.CheesePizza;
import com.company.factory.pizza2.pizzas.ClamPizza;

/**
 * Created by oleg on 16.06.15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingridientFactory);
                pizza.name = "New York Style Cheese Pizza";
                break;
            case "clam":
                pizza = new ClamPizza(ingridientFactory);
                pizza.name = "New York Style Cheese Pizza";
                break;
        }
        return pizza;
    }
}
