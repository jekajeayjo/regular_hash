/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class IntersectionTest {
    
    public IntersectionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        String input = "НачПериода1,НачПериода2,КонПериода1,КонПериода2,НачПериода3";
        Intersection instance = new Intersection();
        String expResult = "+бесконечность";
        String result = instance.findAll(input);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
