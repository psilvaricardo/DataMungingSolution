
package com.teksystems.partone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is just handling simple plain-text read-only file operations as 
 * part of the weather data exercise. 
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class WeatherFileHandler {
    
    private final Function<String, WeatherFileRow> weatherFileRowMapper;
    private final String WEATHER_FILE = "src/main/java/com/teksystems/partone/weather.dat";
    
    public WeatherFileHandler(Function<String, WeatherFileRow> weatherMapper)
    {
        this.weatherFileRowMapper = weatherMapper;
    }
    
    public Stream<WeatherFileRow> doProcessWeatherFile()
    {
        try
        {
            // first, let's read the file
            final Stream<String> lines = 
                    Files.lines(Paths.get(WEATHER_FILE))
            // some numbers have a *s, we need to remove them.
                    .map(l -> l.trim().replaceAll("\\*", ""));          
            // Some validations are required on the weahter file:
            // we don't need the header and last line
            // and all the content I care starts with numbers.
            final Stream<String> fixedLines = lines
                    .filter(l -> l.length() > 0 && Character.isDigit(l.charAt(0)));
            
            return fixedLines.map(weatherFileRowMapper);
        }
        catch ( IOException ioe)
        {
            System.err.println("Error reading the weather file: " + ioe.getLocalizedMessage());
	}
        
        // in case of any errors..
        return null;
    }
    
}
