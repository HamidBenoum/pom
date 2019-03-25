package com.zenika.formation;


import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Assert;


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
        Assert.assertEquals("test1", "test2");
    }
    
}
