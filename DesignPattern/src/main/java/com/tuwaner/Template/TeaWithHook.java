package com.tuwaner.Template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by vincen on 16/5/17.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.print("Would you like lemon with your coffee (y/n)?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = reader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
