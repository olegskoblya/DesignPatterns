package com.company.managedcollections.first.exercise;

import com.company.managedcollections.first.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by oskoblya on 13.07.2015.
 */
public class AlternatingDinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position;

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position+=2;
        return menuItem;
    }

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
