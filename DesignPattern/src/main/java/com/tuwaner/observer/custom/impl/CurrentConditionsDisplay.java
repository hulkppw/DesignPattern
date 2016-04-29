package com.tuwaner.observer.custom.impl;

import com.tuwaner.observer.custom.DisplayElement;
import com.tuwaner.observer.custom.Observer;
import com.tuwaner.observer.custom.Subject;

/**
 * 具体的观察者
 * Created by vincen on 2016/4/29.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject){
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
