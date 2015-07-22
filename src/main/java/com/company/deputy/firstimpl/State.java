package com.company.deputy.firstimpl;

import java.io.Serializable;

/**
 * Created by oskoblya on 16.07.2015.
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
