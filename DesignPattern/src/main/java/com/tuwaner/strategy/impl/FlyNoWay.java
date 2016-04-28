package com.tuwaner.strategy.impl;

import com.tuwaner.strategy.FlyBehavior;

/**
 * 不会飞的鸭子
 * Created by vincen on 2016/4/28.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can not Flying!");
    }
}
