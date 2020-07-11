
package com.teksystems.partthreedry.soccer;

import java.util.function.Function;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is a simple mapper for every row from the football file to the
 * in-memory representation of the data. 
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class SoccerLeagueFileRowMapper {
    
    public static final Function<String, SoccerLeagueFileRow> 
            FOOTBALL_MAPPER = l -> {
                
                final String [] parts = l.split(" +");
                // filtering only the filds I need.
                String Team = parts[1];
                int F = Integer.parseInt(parts[6]);
                int A = Integer.parseInt(parts[8]);
                
                return new SoccerLeagueFileRow( Team, F, A );
              };
      
}
