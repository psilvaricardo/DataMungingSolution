
package com.teksystems.partone;

import java.util.function.Function;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is a simple mapper for every row from the weather file to the
 * in-memory representation of the data. 
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class WeatherFileRowMapper {
    
    public static final Function<String, WeatherFileRow> 
            WEATHER_FILE_ROW_MAPPER = line -> {
                
                String[] fields = line.split(" +");
                // filtering only the filds I need.
                int day = Integer.parseInt(fields[0]);
                int maxTemp = Integer.parseInt(fields[1]);
                int minTemp = Integer.parseInt(fields[2]);
                
                return new WeatherFileRow( day, minTemp, maxTemp);
              };
}
