package com.tuwaner.strategy;

/**
 *
 * 鸭子父类
 * 是一个抽象类，封装一些不变化的行为和属性，对于本例程
 * Created by vincen on 2016/4/28.
 *
 */
public abstract class Duck {

    //鸭子的飞行行为
    public FlyBehavior flyBehavior;
    //鸭子的叫声行为
    public QuackBehavior quackBehavior;

    public Duck(){

    }
    /**
     * 定义鸭子的外观，但是因为具体不同的鸭子，展现出不一样的外观，所以这里使用抽象方法
     *
     */
    public abstract void display();
    /**
     * 所有的鸭子都会游泳
     */
    public void swim(){
        System.out.println("Swimming in water");
    };

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //setter方法动态的设定具体实现类
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
