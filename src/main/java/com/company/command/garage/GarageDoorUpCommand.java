package com.company.command.garage;

import com.company.command.Command;

/**
 * Created by oleg on 19.06.15.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }


    @Override
    public void undo() {

    }
}
