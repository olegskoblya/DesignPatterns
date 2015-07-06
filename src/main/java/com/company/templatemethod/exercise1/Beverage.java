package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 05.07.15.
 */
public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    public abstract void brew();

    public abstract void addCondiments();


    boolean customerWantsCondiments() {return true;}
}
