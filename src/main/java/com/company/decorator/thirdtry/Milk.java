package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.setBeverage(beverage);
        setCondCost(0.10);
    }

    /*@Override
    public double cost() {
        return 0;
    }*/

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
