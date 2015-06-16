package com.company.factory.pizza;

import com.company.factory.pizza.chicago.ChicagoPizzaStore;
import com.company.factory.pizza.newyork.NYPizzaStore;

/**
 * Created by oleg on 14.06.15.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}