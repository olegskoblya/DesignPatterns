package com.company.decorator.thirdtry;

/**
 * Created by oskoblya on 10.06.2015.
 */
public class TestDecorator {
    public static void main(String[] args) {
        System.out.println(new Mocha( new Mocha(new Soy(new Whip(new DarkRoast())))).cost());
    }
}
