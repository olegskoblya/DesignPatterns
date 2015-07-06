package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 05.07.15.
 */
public class Tea extends Beverage {


    @Override
    public void brew() {
        System.out.println("Steeping tea bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
