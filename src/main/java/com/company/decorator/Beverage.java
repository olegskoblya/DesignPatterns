package com.company.decorator;

/**
 * Created by oleg on 6/11/15.
 */
public abstract class Beverage {
    String description = "Unknown beverage";


    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
