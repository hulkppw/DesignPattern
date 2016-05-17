package com.tuwaner.Template;

/**
 * Created by vincen on 16/5/17.
 */
public abstract class CaffeineBeverageWithHook {
    void preparedRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * hook 钩子函数
     * @return
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
