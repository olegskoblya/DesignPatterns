package com.company.factory.pizza2.newyork;

import com.company.factory.pizza2.*;

/**
 * Created by oskoblya on 15.06.2015.
 */
public class NYPizzaIngredientFactory implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return  new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
