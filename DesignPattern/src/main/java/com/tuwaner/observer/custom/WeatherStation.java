package com.tuwaner.observer.custom;

import com.tuwaner.observer.custom.impl.CurrentConditionsDisplay;
import com.tuwaner.observer.custom.impl.WeatherData;

/**
 * 气象站主类
 * Created by vincen on 2016/4/29.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 30.4f);
        //currentConditionsDisplay.display();
    }
}
