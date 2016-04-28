package com.tuwaner.strategy.impl;

import com.tuwaner.strategy.FlyBehavior;

/**
 * 会飞的鸭子
 * Created by vincen on 2016/4/28.
 */
public class FlyWithWings implements FlyBehavior {
    /**
     *可以飞的鸭子
     */
    @Override
    public void fly() {
        System.out.println("Flying!");
    }
}
