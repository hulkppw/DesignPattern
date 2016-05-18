package com.tuwaner.Template;

/**
 * Created by vincen on 16/5/17.
 */
public class BeverageTestDrive {
    public static void main(String[] args){
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        tea.preparedRecipe();

        coffee.preparedRecipe();

    }
}
