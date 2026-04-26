package com.revision.designpattern.command;

public class Main {
    public static void main(String[] args){
        Device light = new Light();
        Device fan = new Fan();

        Command turnOnLight = new TurnOnCommand(light);
        Command turnOffLight = new TurnOffCommand(light);

        Command turnOnFan = new TurnOnCommand(fan);
        Command turnOffFan = new TurnOffCommand(fan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOnFan);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffFan);
        remoteControl.pressButton();
    }
}
