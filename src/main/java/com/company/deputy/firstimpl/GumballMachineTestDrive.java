package com.company.deputy.firstimpl;

/**
 * Created by oleg on 17.07.15.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
