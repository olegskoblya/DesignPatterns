package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.getBeverage(beverage);
        setCondCost(0.20);
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
