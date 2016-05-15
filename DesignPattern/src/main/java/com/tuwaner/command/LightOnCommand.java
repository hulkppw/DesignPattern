package com.tuwaner.command;

/**
 * Created by vincen on 16/5/15.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
