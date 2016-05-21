package com.tuwaner.Iterator2;

import java.util.*;

/**
 * Created by vincen on 16/5/21.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        java.util.Iterator dinerIterator = dinerMenu.createIterator();

        java.util.Iterator cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeMenuIterator);
    }
    public void printMenu(java.util.Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
