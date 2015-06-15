package com.company.factory.pizza.pizza2;

/**
 * Created by oskoblya on 15.06.2015.
 */
public interface PizzaIngridientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
