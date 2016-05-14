package com.tuwaner.factory.factoryfunction;

/**
 * Created by vincen on 2016/5/14.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
            return null;
    }
}
