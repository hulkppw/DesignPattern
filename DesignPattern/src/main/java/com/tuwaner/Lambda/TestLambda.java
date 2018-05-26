package com.tuwaner.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by vincen on 16/9/4.
 */
public class TestLambda {
    public static void main(String[] args){
        runThreadUseLambda();

        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        print(list);

    }
    public static void runThreadUseLambda() {
        new Thread(() -> {
            System.out.print("Lambda");
        }).start();
    }

    public static void print(List<Integer> list){
        System.out.println("Print all numbers:");
        evaluate(list, (n)->true);
        System.out.println("Print no numbers:");
        evaluate(list, (n)->false);
        System.out.println("Print even numbers:");
        evaluate(list, (n)->n%2==0);
        System.out.println("Print odd numbers:");
        evaluate(list, (n)->n%2==1);
        System.out.println("Print numbers greater than 5:");
        evaluate(list, (n)->n>5);
    }

    //Predicate
    public static void evaluate(List<Integer> list , Predicate<Integer> predicate){
        for(Integer n : list){
            if(predicate.test(n)){
                System.out.println(n + " ");
            }
        }

    }
}
