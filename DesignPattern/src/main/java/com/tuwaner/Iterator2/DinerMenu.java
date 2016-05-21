package com.tuwaner.Iterator2;

import com.tuwaner.Iterator.DinerMenuIterator;
import com.tuwaner.Iterator.Iterator;
import com.tuwaner.Iterator.MenuItem;

/**
 * Created by vincen on 16/5/21.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    com.tuwaner.Iterator2.MenuItem[] menuItems;

    public DinerMenu(){

    }

    public void addItem(String name, String description, boolean vegeratian, double price){
        com.tuwaner.Iterator2.MenuItem menuItem = new com.tuwaner.Iterator2.MenuItem(name, description, vegeratian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("对不起菜单已经添加满了,不能继续添加");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    /**
     * 返回迭代器
     * @return
     */
    public java.util.Iterator createIterator(){
        return new com.tuwaner.Iterator2.DinerMenuIterator(menuItems);
    }
}
