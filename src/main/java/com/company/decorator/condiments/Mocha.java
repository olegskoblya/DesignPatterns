package com.company.decorator.condiments;

import com.company.decorator.CondimentDecorator;

/**
 * Created by oleg on 6/11/15.
 */
public class Mocha extends CondimentDecorator{
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
