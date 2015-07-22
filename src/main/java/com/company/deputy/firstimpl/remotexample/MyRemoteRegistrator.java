package com.company.deputy.firstimpl.remotexample;

import java.rmi.Naming;

/**
 * Created by oleg on 22.07.15.
 */
public class MyRemoteRegistrator {
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
