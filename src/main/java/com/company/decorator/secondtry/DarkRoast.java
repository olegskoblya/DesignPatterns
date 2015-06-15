package com.company.decorator.secondtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        setDescription("Most Excellent Dark Roast");
    }

    @Override
    public double cost() {
        return 10.00 + super.cost();
    }
}
