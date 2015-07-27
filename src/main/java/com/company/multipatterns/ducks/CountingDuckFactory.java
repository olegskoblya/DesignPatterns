package com.company.multipatterns.ducks;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
