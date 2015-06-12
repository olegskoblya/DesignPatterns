package com.company.decorator.beverages;

import com.company.decorator.Beverage;

/**
 * Created by oleg on 6/11/15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
