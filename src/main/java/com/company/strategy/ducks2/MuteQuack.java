package com.company.strategy.ducks2;

/**
 * Created by oskoblya on 03.06.2015.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
