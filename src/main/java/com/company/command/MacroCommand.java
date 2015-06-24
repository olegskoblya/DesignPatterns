package com.company.command;

/**
 * Created by oleg on 23.06.15.
 */
public class MacroCommand implements Command{
    Command[] commands;


    public void execute() {
        for (Command comm: commands) {
            comm.execute();
        }
    }


    public void undo() {
        for (Command comm: commands) {
            comm.undo();
        }
    }


    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
}
