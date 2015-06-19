package com.company.singleton.singleton2;

/**
 * Created by oleg on 19.06.15.
 */
public class Singleton {
    private Singleton() {}
    private static volatile Singleton uniqueInstance;


    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
