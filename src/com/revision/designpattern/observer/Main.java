package com.revision.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherListiner phoneDisplay = new PhoneDisplay();
        WeatherListiner tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");

        weatherStation.removeObserver(phoneDisplay);
        weatherStation.setWeather("Rainy");
    }
}
