package com.company.deputy.firstimpl;

import java.rmi.*;

/**
 * Created by oleg on 22.07.15.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;

}
