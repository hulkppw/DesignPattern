package com.tuwaner.Iterator2;

import java.util.*;

/**
 * Created by vincen on 16/5/21.
 */
public class PancakeHouseMenuIterator implements java.util.Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if(position >= items.size() || items.get(position)==null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
