
package com.teksystems.partthreedry.common;

import  com.teksystems.partthreedry.soccer.SoccerLeagueFileRow;
import  com.teksystems.partthreedry.soccer.SoccerLeagueFileRowMapper;
import  com.teksystems.partthreedry.weather.WeatherFileRow;
import  com.teksystems.partthreedry.weather.WeatherFileRowMapper;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is my solution to the data munging exercise using generics, 
 * common and independent code for both scenarios.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class DataMungingSolution {
    
    public static void main( String... args)
    {
        FileHandler<SoccerLeagueFileRow> fileHandler1 =
                new FileHandler<>(SoccerLeagueFileRowMapper.FOOTBALL_MAPPER);
        SoccerLeagueFileRow row1 = (SoccerLeagueFileRow)fileHandler1
                .doProcessFile(AppConstants.FOOTBALL_FILE)
                .sorted(new FileOpsComparator())
                .toArray()[0];
        System.out.printf("Team with smallest difference in 'for' and 'against' goals %s ", row1.getTeamName() );
        
        System.out.println();
        FileHandler<WeatherFileRow> fileHandler2 =
                new FileHandler<>(WeatherFileRowMapper.WEATHER_FILE_ROW_MAPPER);
        WeatherFileRow row2 = (WeatherFileRow)fileHandler2
                .doProcessFile(AppConstants.WEATHER_FILE)
                .sorted(new FileOpsComparator())
                .toArray()[0];
        System.out.printf("Smallest temperature spread on day %n ", row2.getDy() );
        
        
    }
    
}
