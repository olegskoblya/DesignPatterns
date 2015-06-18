package com.company.singleton;

/**
 * Created by oleg on 18.06.15.
 */
public class Singleton {
    private static Singleton uniqueObject;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueObject != null) {
            uniqueObject = new Singleton();
        }
        return uniqueObject;
    }
}
