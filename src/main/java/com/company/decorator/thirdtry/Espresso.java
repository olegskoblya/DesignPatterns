package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class Espresso extends Beverage{
    public Espresso() {
        setCost(1.99);
    }

    @Override
    public double cost() {
        return 0;
    }
}
