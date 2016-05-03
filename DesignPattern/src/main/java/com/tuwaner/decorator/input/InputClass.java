package com.tuwaner.decorator.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by vincen on 2016/5/1.
 */
public class InputClass {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream(""));
    }
}
