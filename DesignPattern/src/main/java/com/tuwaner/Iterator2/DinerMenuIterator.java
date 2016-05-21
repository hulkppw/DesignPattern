package com.tuwaner.Iterator2;

import java.util.*;
import java.util.Iterator;

/**
 * Created by vincen on 16/5/21.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * 判断是否还有写一个
     *
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
     *
     * @return
     */
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;

        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }


}
