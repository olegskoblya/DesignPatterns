package com.company.templatemethod.exercise1;

/**
 * Created by oleg on 06.07.15.
 */
public class CoffeTeaTestDrive {
    public static void main(String[] args) {

            Coffee coffee = new Coffee();
            Tea tea = new Tea();

            System.out.println("\n Preparing tea");
            tea.prepareRecipe();

            System.out.println("\n Preparing coffee");
            coffee.prepareRecipe();

    }
}
