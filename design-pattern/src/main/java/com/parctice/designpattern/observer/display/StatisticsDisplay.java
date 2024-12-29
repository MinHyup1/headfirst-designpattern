package com.parctice.designpattern.observer.display;

import com.parctice.designpattern.observer.Observer;
import com.parctice.designpattern.observer.WeatherData;

public class StatisticsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public StatisticsDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + this.temperature + "F, 습도 " + humidity + "%, 기압 " + pressure);
    }
}
