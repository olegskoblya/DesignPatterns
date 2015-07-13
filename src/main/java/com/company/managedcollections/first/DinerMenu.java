package com.company.managedcollections.first;

/**
 * Created by oleg on 10.07.15.
 */

import java.util.Iterator;


public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeterian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);

    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public Iterator createIterator() {
        return new DinerMenuItertor();
    }

    private class DinerMenuItertor implements Iterator{
        int position = 0;

        @Override
        public Object next() {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }

        @Override
        public boolean hasNext() {
            boolean has = position < menuItems.length && menuItems[position] != null;
            position++;
            return has;
        }

        @Override
        public void remove() {
            if (position <= 0) {
                throw new IllegalStateException("You can't remove an item until you've done at least one next()");
            }
            if (menuItems[position-1] != null) {
                for (int i = position - 1; i < menuItems.length - 1; i++) {
                    menuItems[i] = menuItems[i + 1];
                }
                menuItems[menuItems.length - 1] = null;
            }
        }
    }
}
