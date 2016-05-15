package com.tuwaner.command;

/**
 * Created by vincen on 16/5/15.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.off();
    }
}
