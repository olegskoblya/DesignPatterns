package com.company.templatemethod.ducksorting;

import org.junit.*;

import java.util.Arrays;

/**
 * Created by oleg on 06.07.15.
 */
public class DuckSortTestDrive extends Assert {

    @Test
    public void ducksSortTest() {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };
        System.out.println("Before sorting...");
        ducksDisplay(ducks);
        Arrays.sort(ducks);
        System.out.println("\nAfter sorting...");
        ducksDisplay(ducks);
    }


    private void ducksDisplay(Duck[] ducks) {
        for (Duck duck: ducks) {
            System.out.println(duck);
        }
    }

}
