package com.company.command;

/**
 * Created by oleg on 19.06.15.
 */
public interface Command {
    void execute();
    void undo();
}
