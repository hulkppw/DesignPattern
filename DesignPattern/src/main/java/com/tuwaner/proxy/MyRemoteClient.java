package com.tuwaner.proxy;

import java.rmi.Naming;

/**
 * Created by vincen on 16/5/22.
 */
public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            MyRemote servcie = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = servcie.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
