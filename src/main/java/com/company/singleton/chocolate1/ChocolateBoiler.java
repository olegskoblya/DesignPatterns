package com.company.singleton.chocolate1;

/**
 * Created by oleg on 18.06.15.
 */
public class ChocolateBoiler {
    private static ChocolateBoiler uniqueObject;
    private boolean empty;
    private boolean boiled;



    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueObject == null) {
            uniqueObject = new ChocolateBoiler();
        }
        return uniqueObject;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

}
