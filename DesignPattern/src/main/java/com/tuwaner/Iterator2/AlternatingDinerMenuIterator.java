package com.tuwaner.Iterator2;

import java.util.*;

/**
 * Created by vincen on 16/5/21.
 */
public class AlternatingDinerMenuIterator implements java.util.Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }


    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;

        return position;
    }

    public void remove() {
        throw new UnsupportedOperationException("不支持删除操作");
    }
}
