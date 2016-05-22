package com.tuwaner.state;

/**
 * Created by vincen on 16/5/22.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, sold out");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, sold out");
    }

    public void turnCrack() {
        System.out.println("Sorry, sold out");
    }

    public void dispense() {
        System.out.println("Sorry, sold out");
    }
}
