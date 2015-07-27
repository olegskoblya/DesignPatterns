package com.company.multipatterns.ducks;


import com.company.adapter.Duck;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }


    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable readheadDuck = new QuackCounter(new ReadheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(readheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
