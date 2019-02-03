/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class testWrongExpressions {
    
    public testWrongExpressions() {
    }
    
   
    
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of stringCheck method, of class Brackets.
     */
    @Test
    public void testStringCheck1() {
        System.out.println("stringCheck1");
        String inputExpression="{{";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
  
        assertEquals(expResult, result);
      
    }
     @Test
    public void testStringCheck2() {
        System.out.println("stringCheck2");
        String inputExpression="{{)";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
  
        assertEquals(expResult, result);
       
    }
     @Test
    public void testStringCheck3() {
        System.out.println("stringCheck3");
        String inputExpression="{{[(]}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);

        assertEquals(expResult, result);
     
    }
    
}
