package com.revision.designpattern.observer;

//Concrete observer
public class PhoneDisplay implements WeatherListiner{
    @Override
    public void update(String weather) {
        System.out.println("Phone display: " + weather);
    }
}
