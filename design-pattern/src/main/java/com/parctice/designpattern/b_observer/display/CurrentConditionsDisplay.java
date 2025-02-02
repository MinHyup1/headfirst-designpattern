package com.parctice.designpattern.b_observer.display;

import com.parctice.designpattern.b_observer.Observer;
import com.parctice.designpattern.b_observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + this.temperature + "F, 습도 " + humidity + "%");
    }
}
