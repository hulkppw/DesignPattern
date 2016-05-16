package com.tuwaner.Adapter;

/**
 * Created by vincen on 16/5/16.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i=0; i < 5; i++){
            turkey.fly();
        }
    }
}
