package com.company.managedcollections.first;

import java.util.ArrayList;

/**
 * Created by oleg on 11.07.15.
 */
public class PankaceHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    @Override
    public boolean hasNext() {

        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (position < menuItems.size()) {
            MenuItem menuItem = menuItems.get(position);
            position++;
            return menuItem;
        } else {
            return null;
        }
    }

    public PankaceHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
