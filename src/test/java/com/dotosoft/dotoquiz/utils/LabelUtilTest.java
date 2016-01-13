package com.dotosoft.dotoquiz.utils;

import java.util.Locale;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LabelUtilTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LabelUtilTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LabelUtilTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLabelUtil()
    {
    	String label = "com.dotoquiz.common.err.match.closed";
    	System.out.println(LabelUtils.getLabel(label));
    	System.out.println(LabelUtils.getLabel(Locale.FRENCH, "common", label));
    	System.out.println(LabelUtils.getLabel(Locale.GERMAN, "common", label));
    }
}
