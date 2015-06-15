package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public abstract class CondimentDecorator extends Beverage{


    public void setCondCost(double condCost) {
        this.condCost = condCost;
    }

    private Beverage beverage;
    private double condCost;

    public Beverage getBeverage(Beverage beverage) {
        return this.beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + condCost;
    }
}
