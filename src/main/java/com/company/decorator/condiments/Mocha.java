package com.company.decorator.condiments;

import com.company.decorator.Beverage;
import com.company.decorator.CondimentDecorator;

/**
 * Created by oleg on 6/11/15.
 */
public class Mocha extends CondimentDecorator{
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }


    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
