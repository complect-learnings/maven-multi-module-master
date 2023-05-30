package com.mycompany.maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for Module6
 */
public class Module6ApplicationTest {

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before Class Setup");
    }

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After Class Teardown");
    }

    @Test
    public void testMethod() {
        System.out.println("Testing Method");
    }
}
