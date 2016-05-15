package com.tuwaner.factory.abstractfactory;



/**
 * Created by vincen on 2016/5/14.
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return null;
    }



}
