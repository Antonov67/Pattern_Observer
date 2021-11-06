package com.company;

public class Main {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();
	    CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
	    weatherData.setMeasurments(80, 65, 30.4f);
        weatherData.setMeasurments(82, 70, 29.2f);
        weatherData.setMeasurments(78, 90, 28.4f);
        currentConditionsDisplay.display();
    }
}
