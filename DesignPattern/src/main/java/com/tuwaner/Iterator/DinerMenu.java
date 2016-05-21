package com.tuwaner.Iterator;

/**
 * Created by vincen on 16/5/21.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){

    }

    public void addItem(String name, String description, boolean vegeratian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
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
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
