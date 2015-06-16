package com.company.factory.pizza.newyork;

import com.company.factory.pizza.Pizza;

/**
 * Created by � � � � � on 13.06.2015.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinata Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
