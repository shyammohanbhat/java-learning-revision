package com.revision.designpattern.observer;

//Subject interface
public interface WeatherPublisher {
    void addObserver(WeatherListiner weatherListiner);
    void removeObserver(WeatherListiner weatherListiner);
    void notifyAllObserver();
}
