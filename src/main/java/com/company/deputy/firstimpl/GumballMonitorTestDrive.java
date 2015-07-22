package com.company.deputy.firstimpl;

import java.rmi.Naming;

/**
 * Created by oleg on 22.07.15.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://localhost/gumballmachine"};
        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {

                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            for (GumballMonitor mon:monitors) {
                mon.report();
            }
        }
    }
}
