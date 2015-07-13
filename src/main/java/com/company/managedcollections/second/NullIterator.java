package com.company.managedcollections.second;

import java.util.Iterator;

/**
 * Created by oskoblya on 13.07.2015.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
