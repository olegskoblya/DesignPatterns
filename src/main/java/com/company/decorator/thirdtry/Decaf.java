package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class Decaf extends Beverage{

    public Decaf() {
        setCost(1.05);
    }

    @Override
    public double cost() {
        return 0;
    }
}
