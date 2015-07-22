package com.company.deputy.firstimpl;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by oleg on 17.07.15.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        GumballMachine gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try{
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//"+args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
