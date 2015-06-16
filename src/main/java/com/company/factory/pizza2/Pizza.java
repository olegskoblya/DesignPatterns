package com.company.factory.pizza2;

/**
 * Created by oskoblya on 15.06.2015.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggie[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;


    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    };

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
