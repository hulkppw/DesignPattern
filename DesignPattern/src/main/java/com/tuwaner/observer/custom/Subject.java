package com.tuwaner.observer.custom;

/**
 * 主题接口
 * Created by vincen on 2016/4/29.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
