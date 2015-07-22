package com.company.deputy.firstimpl.remotexample;

import java.rmi.*;

/**
 * Created by oleg on 22.07.15.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
