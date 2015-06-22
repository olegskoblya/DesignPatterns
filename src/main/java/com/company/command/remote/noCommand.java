package com.company.command.remote;

import com.company.command.Command;

/**
 * Created by oleg on 22.06.15.
 */
public class noCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command!");
    }


}
