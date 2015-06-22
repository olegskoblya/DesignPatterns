package com.company.command.garage;

import com.company.command.Command;

/**
 * Created by oleg on 22.06.15.
 */
public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
