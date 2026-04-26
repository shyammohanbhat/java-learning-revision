package com.revision.designpattern.command;

//Concrete Receiver
public class Fan implements Device{
    @Override
    public void turnOn() {
            System.out.println("Fan ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan OFF");
    }
}
