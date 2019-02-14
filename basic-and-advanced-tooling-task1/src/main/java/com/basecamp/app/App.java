package com.basecamp.app;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("MyLogger");
        logger.fine("Say hello");

        System.out.println( "Hello World!" );
    }
}
