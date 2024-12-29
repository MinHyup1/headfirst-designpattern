package com.parctice.designpattern.observer;

import com.parctice.designpattern.observer.display.CurrentConditionsDisplay;
import com.parctice.designpattern.observer.display.StatisticsDisplay;

public class ObserverMainApplication {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        final CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
