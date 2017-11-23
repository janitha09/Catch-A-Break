/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.canitakeabreaklibrary;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janitha
 */
public class NewClassTest {
    
    public NewClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of canITakeABreak method, of class NewClass.
     */
    //building exits or occupancy
    @Test
    public void testCanITakeABreak() {
        //System.out.println("canITakeABreak");
        NewClass instance = new NewClass();
        boolean expResult = true;
        boolean result = instance.canITakeABreak();
        //where am I, what's happening on the street
        //If I am the owner (for myself for my employees), if I am an employee
        //decide based on time
        //decide based on traffic in the street now
        // traffic on the street in the near future.
        // Assume you are in a busy street you have customers, it's the day and
        // the time of day. I am thinking I need drules.
        //the object is the person, object for each subscriber
        assertEquals(expResult, result);
    }
    @Test
    public void testShouldIBeAtWorkNow(){
        NewClass instance = new NewClass();
        boolean expResult = true;
        boolean result = instance.ShouldIBeAtWorkNow();
//        assertEquals(expResult, result);
    }
    @Test
    public void testShouldIGotoWorkToday(){
        NewClass instance = new NewClass();
        
        //you give the start and the end of the working week
        boolean result = instance.ShouldIGotoWorkToday(1,0,5);
        assertEquals(true, result);
        result = instance.ShouldIGotoWorkToday(1,2,6);
        assertEquals(false, result);
    }
    
}
