package com.company.decorator.condiments;

import com.company.decorator.Beverage;
import com.company.decorator.CondimentDecorator;

/**
 * Created by oleg on 6/11/15.
 */
public class Whip extends CondimentDecorator{
    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
