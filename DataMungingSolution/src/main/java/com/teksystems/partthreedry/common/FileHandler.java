
package com.teksystems.partthreedry.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Ricardo Plascencia Silva
 * ricardo072@gmail.com
 * 
 * This class is just handling simple plain-text read-only file operations. 
 * 
 * @see http://codekata.com/kata/kata04-data-munging/
 */
public class FileHandler<T> {
    private final Function<String, T> mapper;
    
    public FileHandler(Function<String, T> mapper)
    {
        this.mapper = mapper;
    }
    
    public Stream<T> doProcessFile(String FILE)
    {
        try
        {
            // first, let's read the file
            final Stream<String> lines = 
                    Files.lines(Paths.get(FILE))
            // some numbers have a *s, we need to remove them.
                    .map(l -> l.trim().replaceAll("\\*", ""));          
            // Some validations are required on the weahter file:
            // we don't need the header and last line
            // and all the content I care starts with numbers.
            final Stream<String> fixedLines = lines
                    .filter(l -> l.length() > 0 && Character.isDigit(l.charAt(0)));
            
            return fixedLines.map(mapper);
        }
        catch ( IOException ioe)
        {
            System.err.println("Error reading the file: " + ioe.getLocalizedMessage());
	}
                
        // in case of any errors..
        return null;
    }
    
}
