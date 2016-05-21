package com.tuwaner.Composite;

/**
 * Created by vincen on 16/5/21.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
