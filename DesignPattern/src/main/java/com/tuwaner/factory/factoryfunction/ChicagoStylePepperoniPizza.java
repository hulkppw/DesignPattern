package com.tuwaner.factory.factoryfunction;

/**
 * Created by vincen on 2016/5/14.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
