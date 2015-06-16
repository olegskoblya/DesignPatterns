package com.company.factory.pizza.chicago;

import com.company.factory.pizza.Pizza;

/**
 * Created by � � � � � on 13.06.2015.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        setName("Chicago style Deep Dish Cheese Pizza");
        setDough("Exctra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
