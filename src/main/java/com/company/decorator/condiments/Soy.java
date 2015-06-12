package com.company.decorator.condiments;

import com.company.decorator.Beverage;
import com.company.decorator.CondimentDecorator;

/**
 * Created by oleg on 6/11/15.
 */
public class Soy extends CondimentDecorator{
    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
