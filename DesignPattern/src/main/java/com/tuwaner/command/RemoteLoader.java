package com.tuwaner.command;

/**
 * Created by vincen on 16/5/15.
 */
public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light() {
            @Override
            public void on() {

            }

            @Override
            public void off() {

            }
        };
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommands(1, stereoOnWithCDCommand, stereoOnWithCDCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
    }
}
