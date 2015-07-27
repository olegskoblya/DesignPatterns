package com.company.multipatterns.ducks;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
