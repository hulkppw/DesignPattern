package com.tuwaner.observer.javautil;

/**
 * Created by vincen on 2016/4/29.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 30.4f);
    }
}
