package com.company.command.cellingfan;

/**
 * Created by oleg on 22.06.15.
 */
public class CeilingFan {

    String name;

    public void on() {
        System.out.println("Celling Fan in " + name + " is on!");
    }

    public void off() {
        System.out.println("Celling Fan in " + name + " is off!");
    }

    public CeilingFan(String name) {
        this.name = name;
    }
}
