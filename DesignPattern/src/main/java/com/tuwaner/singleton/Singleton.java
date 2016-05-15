package com.tuwaner.singleton;

/**
 * 单例模式
 * Created by vincen on 16/5/15.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;

    }

}
