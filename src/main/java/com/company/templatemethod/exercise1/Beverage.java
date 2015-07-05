package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 05.07.15.
 */
public abstract class Beverage {
    public abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
