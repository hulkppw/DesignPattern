package com.tuwaner.Iterator;

/**
 * Created by vincen on 16/5/21.
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
}
