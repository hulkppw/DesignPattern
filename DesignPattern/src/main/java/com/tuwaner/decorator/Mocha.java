package com.tuwaner.decorator;

/**
 * 具体的装饰器
 * Created by vincen on 2016/5/1.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
