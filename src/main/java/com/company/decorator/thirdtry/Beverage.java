package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public abstract class Beverage {
    private String description;
    private double cost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double cost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
