package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        setCost(0.89);
    }

    @Override
    public double cost() {
        return 0;
    }
}
