package com.company.command.light;

/**
 * Created by oleg on 22.06.15.
 */
public class Light {
    String name;
    public void off() {
        System.out.println("Light in " + name + " is off");
    }
    public void on() {
        System.out.println("Light in " + name + " is on");
    }

    public Light(String name) {
        this.name = name;
    }
}
