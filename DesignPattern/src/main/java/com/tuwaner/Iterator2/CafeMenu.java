package com.tuwaner.Iterator2;

import com.tuwaner.Iterator.*;

import java.util.*;
import java.util.Iterator;

/**
 * Created by vincen on 16/5/21.
 */
public class CafeMenu implements Menu {

    Map menuItems = new Hashtable();

    public CafeMenu(){

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
