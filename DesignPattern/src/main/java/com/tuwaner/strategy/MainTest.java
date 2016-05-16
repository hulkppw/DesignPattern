package com.tuwaner.strategy;

import com.tuwaner.strategy.impl.FlyNoWay;
import com.tuwaner.strategy.impl.MuteQuack;
import org.junit.Test;


/**
 * 测试类
 * Created by vincen on 2016/4/28.
 */
public class MainTest {
    @Test
    public void test(){
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
