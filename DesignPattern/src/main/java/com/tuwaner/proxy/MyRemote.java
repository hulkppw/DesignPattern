package com.tuwaner.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by vincen on 16/5/22.
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}
