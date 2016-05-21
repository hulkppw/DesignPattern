package com.tuwaner.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vincen on 16/5/21.
 */
public class Menu extends MenuComponent {

    List menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println(" ----------- ");

        //递归调用打印方法
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
