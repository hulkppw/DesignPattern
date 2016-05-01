package com.tuwaner.decorator;

/**
 * Created by vincen on 2016/5/1.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
