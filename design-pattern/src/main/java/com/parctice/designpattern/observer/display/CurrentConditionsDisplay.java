package com.parctice.designpattern.observer.display;

import com.parctice.designpattern.observer.Observer;
import com.parctice.designpattern.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + this.temperature + "F, 습도 " + humidity + "%");
    }
}
