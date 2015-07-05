package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 05.07.15.
 */
public class Coffee extends Beverage {
    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
}
