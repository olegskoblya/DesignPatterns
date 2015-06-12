package com.company.decorator.beverages;

import com.company.decorator.Beverage;

/**
 * Created by oleg on 6/11/15.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
