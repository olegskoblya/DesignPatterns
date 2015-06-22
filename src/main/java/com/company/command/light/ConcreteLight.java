package com.company.command.light;

import com.company.command.Light;

/**
 * Created by oleg on 19.06.15.
 */
public class ConcreteLight implements Light {
    @Override
    public void on() {
        System.out.println("Light is on!");
    }

    @Override
    public void off() {
        System.out.println("Light is off!");
    }
}
