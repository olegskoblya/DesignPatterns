package com.company.templatemethod.ducksorting;

/**
 * Created by oleg on 06.07.15.
 */
public class Duck implements Comparable {

    private String name;
    private int weight;

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.getWeight()) {
            return -1;
        } else if (this.weight == otherDuck.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + " weights " + this.weight;
    }
}
