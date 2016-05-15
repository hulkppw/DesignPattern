package com.tuwaner.singleton;

/**
 * 单例模式
 * Created by vincen on 16/5/15.
 */
public class Singleton {
    //volatile关键字禁止指令重排优化,
    /**
     * 为什么需要使用volatile关键字
     * uniqueInstance = new Singleton();
     * 在JVM中这句话做了3件事情,
     * 1.给uniqueInstance分配内存
     * 2.调用Singleton的构造函数来事例化成员变量,生成事例
     * 3.将singleton指向分配的内存空间
     * JVM中存在指令重排序的优化,对于第2步和第3步的顺序是不能保证的
     */
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
