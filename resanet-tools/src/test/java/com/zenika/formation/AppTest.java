package com.zenika.formation;


import junit.framework.TestCase;
import org.apache.log4j.Logger;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    // Variable static
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AppTest.class));
    /**
     * Rigorous Test :-)
     */

    public void testApp() {
        LOGGER.debug("Welcome to Zenika !");
        assertTrue( true );
    }
    
}
