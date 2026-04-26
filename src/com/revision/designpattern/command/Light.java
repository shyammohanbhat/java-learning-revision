package com.revision.designpattern.command;

//Concrete Receiver
public class Light  implements  Device{
    @Override
    public void turnOn() {
        System.out.println("Light ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light OFF");
    }
}
