package com.company.command.cellingfan;

import com.company.command.Command;

/**
 * Created by oleg on 22.06.15.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }


    @Override
    public void undo() {

    }
}
