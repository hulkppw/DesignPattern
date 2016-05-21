package com.tuwaner.Composite;

import com.tuwaner.Iterator.Iterator;

/**
 * Created by vincen on 16/5/21.
 */
public class NullIterator implements java.util.Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException("");
    }
}
