package com.company.state.state1;

/**
 * Created by oskoblya on 16.07.2015.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, there is no gumballs in machine!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, there is no gumballs in machine!");
    }

    @Override
    public void dispense() {
        System.out.println("No balls dispensed!");
    }
}
