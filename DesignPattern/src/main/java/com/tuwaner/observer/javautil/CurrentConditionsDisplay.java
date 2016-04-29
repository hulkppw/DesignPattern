package com.tuwaner.observer.javautil;

import com.tuwaner.observer.custom.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by vincen on 2016/4/29.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private Object temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            //WeatherData data = (WeatherData) arg;
            this.temperature = arg;
            //this.humidity = data.getHumidity();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}
