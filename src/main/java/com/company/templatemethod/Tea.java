package com.company.templatemethod;

/**
 * Created by oleg on 05.07.15.
 */
public class Tea {

    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();

    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping tea bag");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
