package com.company.multipatterns.ducks;

/**
 * Created by oskoblya on 27.07.2015.
 */
public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createQuackableGoose() {
        return new GooseAdapter(new Goose());
    }
}
