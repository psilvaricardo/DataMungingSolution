
package com.teksystems.parttwo;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is reading the football.dat file from the second part of the
 * Data Munging coding exercise, as follows:
 * 
 * The file football.dat contains the results from the English Premier League 
 * for 2001/2. The columns labeled ‘F’ and ‘A’ contain the total number of 
 * goals scored for and against each team in that season (so Arsenal scored 
 * 79 goals against opponents, and had 36 goals scored against them). Write 
 * a program to print the name of the team with the smallest difference 
 * in ‘for’ and ‘against’ goals.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class PartTwoSoccerLeagueData {
        
    public static void main(String... args)
    {
        SoccerLeagueFileHandler  fileHandler = 
                new SoccerLeagueFileHandler(SoccerLeagueFileRowMapper.FOOTBALL_MAPPER);
        SoccerLeagueFileRow row = (SoccerLeagueFileRow)fileHandler.doProcessSoccerFile()
                .sorted(new SoccerFileInfoComparator()).toArray()[0];
        System.out.printf("Team with smallest difference in 'for' and 'against' goals %s ", row.getTeamName() );
    }
    
}
