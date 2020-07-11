
package com.teksystems.partone;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is an in-memory representation of the weather's file's rows.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class WeatherFileRow implements WeatherFileOps{
    private final int Dy; // day number
    private final int MxT; // max temp
    private final int MnT; // min temp
    
    public WeatherFileRow( int day, int maxTemp, int minTemp )
    {
        this.Dy = day;
        this.MxT = maxTemp;
        this.MnT = minTemp;
    }
    
    public int getDy(){ return this.Dy; }
    
    @Override
    public int doSubtraction()
    {
        return this.MxT - this.MnT;
    }
    
}
