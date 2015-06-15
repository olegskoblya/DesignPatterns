package com.company.decorator.secondtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class Beverage {
    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public double cost() {
        double cost = 0.00;
        if (milk) {cost+=0.45;}
        if (soy) {cost+=0.5;}
        if (mocha) {cost+=0.6;}
        if (whip) {cost+=0.7;}
        return cost;
    }
}
