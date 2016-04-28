package com.tuwaner.strategy;

/**
 * 模型鸭子
 * Created by vincen on 2016/4/28.
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
