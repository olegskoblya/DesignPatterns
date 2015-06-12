package com.company.decorator.beverages;

import com.company.decorator.Beverage;

/**
 * Created by oleg on 6/11/15.
 */
public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Without coffeine");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
