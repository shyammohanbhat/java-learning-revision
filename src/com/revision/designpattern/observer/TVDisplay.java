package com.revision.designpattern.observer;

//Concrete observer
public class TVDisplay implements WeatherListiner{
    @Override
    public void update(String weather) {
        System.out.println("TV display: " + weather);
    }
}
