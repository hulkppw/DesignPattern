package com.tuwaner.Iterator;

import java.util.*;

/**
 * Created by vincen on 16/5/21.
 */
public class DinerMenuIterator implements java.util.Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * 判断是否还有写一个
     * @return
     */
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else
            return true;
    }

    /**
     * 返回下一个元素
     * @return
     */
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;

        return menuItem;
    }
}
