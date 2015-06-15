package com.company.factory.pizza.pizza2.chicago;

import com.company.factory.pizza.pizza2.*;
import com.company.factory.pizza.pizza2.chicago.veggies.BlackOlives;
import com.company.factory.pizza.pizza2.chicago.veggies.EggPlant;
import com.company.factory.pizza.pizza2.chicago.veggies.Spinach;
import com.company.factory.pizza.pizza2.newyork.SlicedPepperoni;

/**
 * Created by oskoblya on 15.06.2015.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new Spinach(), new EggPlant(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
