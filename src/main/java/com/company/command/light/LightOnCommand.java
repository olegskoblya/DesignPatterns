package com.company.command.light;

import com.company.command.Command;
import com.company.command.Light;

/**
 * Created by oleg on 19.06.15.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
