
package com.teksystems.partone;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is reading the weather.dat file from the first part of the
 * Data Munging coding exercise, as follows:
 * 
 * In weather.dat you'll find daily weather data for Morristown, NJ for 
 * June 2002. Download this text file, then write a program to output the 
 * day number (column one) with the smallest temperature spread 
 * (the maximum temperature is the second column, the minimum the third column).
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class PartOneWeatherData {
    
    public static void main(String... args)
    {
        WeatherFileHandler fileHandler = 
                new WeatherFileHandler(WeatherFileRowMapper.WEATHER_FILE_ROW_MAPPER);
        WeatherFileRow row = (WeatherFileRow)fileHandler.doProcessWeatherFile()
                .sorted(new WeatherFileInfoComparator()).toArray()[0];
        System.out.printf("Smallest temperature spread on day %n ", row.getDy() );
    }
    
}
