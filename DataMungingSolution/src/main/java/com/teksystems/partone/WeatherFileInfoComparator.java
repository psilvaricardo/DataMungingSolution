
package com.teksystems.partone;

import java.util.Comparator;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * Collections has a sort method that takes a Comparator, we will use this
 * class as a helper to determine the smallest temperature spread after 
 * sorting the data.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class WeatherFileInfoComparator implements Comparator<WeatherFileOps> {

    @Override
    public int compare(WeatherFileOps o1, WeatherFileOps o2) {
        return o1.doSubtraction() - o2.doSubtraction();
    }
    
}
