package com.tuwaner.decorator;

/**
 * Created by vincen on 2016/5/1.
 */
public class StarBuzzCoffee {
    public static void main(String[] args){
        Beverage espresso = new Espresso();

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
