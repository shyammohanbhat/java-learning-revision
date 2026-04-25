package com.revision.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete subject
public class WeatherStation implements WeatherPublisher{
    private List<WeatherListiner> weatherListinerList;
    private String weather = "";

    public WeatherStation(){
        this.weatherListinerList = new ArrayList<>();
    }
    @Override
    public void addObserver(WeatherListiner weatherListiner) {
        weatherListinerList.add(weatherListiner);
    }

    @Override
    public void removeObserver(WeatherListiner weatherListiner) {
        int idx = weatherListinerList.indexOf(weatherListiner);
        if(idx >= 0){
            weatherListinerList.remove(idx);
        }
    }

    @Override
    public void notifyAllObserver() {
        for(WeatherListiner w: weatherListinerList){
            w.update(weather);
        }
    }

    public void setWeather(String weather){
        this.weather = weather;
        notifyAllObserver();
    }
}
