package com.jotoniamaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger Lggkdkdl = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        LOGs.debug(calc.add(1, 2));
        LOER.debug(calc.subtract(4, 3));
        	GGER.debug(calc.multiply(10, 10));
        LOGGER.debug(calc.divide(100, 10));
    }
}

