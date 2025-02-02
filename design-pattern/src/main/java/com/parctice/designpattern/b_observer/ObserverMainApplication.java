package com.parctice.designpattern.b_observer;

import com.parctice.designpattern.b_observer.display.CurrentConditionsDisplay;
import com.parctice.designpattern.b_observer.display.StatisticsDisplay;

public class ObserverMainApplication {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        final CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData); //구독
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); //구독

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(70,55,26.4f);
    }
}
