package com.tuwaner.observer.swing.custom;

/**
 * 观察者接口
 * Created by vincen on 2016/4/29.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
