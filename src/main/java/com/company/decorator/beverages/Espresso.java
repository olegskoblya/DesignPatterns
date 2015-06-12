package com.company.decorator.beverages;

import com.company.decorator.Beverage;

/**
 * Created by oleg on 6/11/15.
 */
public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
