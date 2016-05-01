package com.tuwaner.decorator;

/**
 * Created by vincen on 2016/5/1.
 */
public abstract class Beverage {
    String description = "Unknow Beverage";
    public String getDescription(){
        return description;
    }

    /**
     * 子类覆盖
     * @return
     */
    public abstract double cost();
}
