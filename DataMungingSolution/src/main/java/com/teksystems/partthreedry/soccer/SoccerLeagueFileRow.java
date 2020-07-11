
package com.teksystems.partthreedry.soccer;

import com.teksystems.partthreedry.common.FileOps;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is an in-memory representation of the football's file's rows.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 * 
 */
public class SoccerLeagueFileRow implements FileOps {
    private final String Team; // Team name header
    private int F; // Scored goals header
    private int A; // Against goals header
    
    public SoccerLeagueFileRow( String team, int f, int a )
    {
        this.Team = team;
        this.F = f;
        this.A = a;
    }
    
    public String getTeamName(){ return this.Team; }

    @Override
    public int doSubtraction() {
        return this.F - this.A;
    }
    
}
