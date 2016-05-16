package com.tuwaner.Adapter;

/**
 * Created by vincen on 16/5/16.
 */
public class DuckTestDrive {
    public static void main(String[] args){
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
