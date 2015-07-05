package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 05.07.15.
 */
public class Tea extends Beverage {
    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }


    public void steepTeaBag() {
        System.out.println("Steeping tea Bag");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
