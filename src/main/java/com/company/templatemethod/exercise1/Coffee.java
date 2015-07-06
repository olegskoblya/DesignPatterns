package com.company.templatemethod.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by oleg on 05.07.15.
 */
public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Milk And Sugar ");
    }


    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO Error trying to read your answer!");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
