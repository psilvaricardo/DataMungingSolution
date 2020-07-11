
package com.teksystems.partthreedry.common;

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
public class FileOpsComparator implements Comparator<FileOps> {

    @Override
    public int compare(FileOps o1, FileOps o2) {
        return o1.doSubtraction() - o2.doSubtraction();
    }
    
}
