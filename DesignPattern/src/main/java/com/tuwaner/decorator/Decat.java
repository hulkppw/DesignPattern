package com.tuwaner.decorator;

/**
 * Created by vincen on 2016/5/1.
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1;
    }
}
