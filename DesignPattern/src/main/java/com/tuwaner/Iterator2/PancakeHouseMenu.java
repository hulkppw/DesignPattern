package com.tuwaner.Iterator2;

import java.util.*;

/**
 * Created by vincen on 16/5/21.
 */
public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

    }

    public void addItem(String name, String description, boolean vegeratian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
        menuItems.add(menuItem);
    }
    /**
     * 返回迭代器
     * @return
     */
    public java.util.Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

}
