package com.company.state.state1;

/**
 * Created by oskoblya on 16.07.2015.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
