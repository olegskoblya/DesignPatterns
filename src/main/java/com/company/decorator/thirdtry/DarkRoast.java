package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        setCost(0.99);
    }

    @Override
    public double cost() {
        return 0;
    }
}
