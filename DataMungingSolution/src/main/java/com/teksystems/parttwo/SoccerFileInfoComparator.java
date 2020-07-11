
package com.teksystems.parttwo;

import java.util.Comparator;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * Collections has a sort method that takes a Comparator, we will use this
 * class as a helper to determine the smallest difference in ‘for’ and ‘against’ goals 
 * after sorting the data.
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class SoccerFileInfoComparator implements Comparator<SoccerFileOps> {

    @Override
    public int compare(SoccerFileOps o1, SoccerFileOps o2) {
        return o1.doSubtraction() - o2.doSubtraction();
    }
    
}
