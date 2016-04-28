package com.tuwaner.strategy.impl;

import com.tuwaner.strategy.QuackBehavior;

/**
 * 不会叫的鸭子
 * Created by vincen on 2016/4/28.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
