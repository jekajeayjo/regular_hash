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
    public void testWrongExpressions1() {
        System.out.println("testWrongExpressions1");
        String inputExpression="{{";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
  
        assertEquals(expResult, result);
      
    }
     @Test
    public void testWrongExpressions2() {
        System.out.println("testWrongExpressions2");
        String inputExpression="{{)";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
  
        assertEquals(expResult, result);
       
    }
     @Test
    public void testWrongExpressions3() {
        System.out.println("testWrongExpressions3");
        String inputExpression="{{[(]}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = false;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);

        assertEquals(expResult, result);
     
    }
     @Test
    public void testCorrectExpressions1() {
        System.out.println("testCorrectExpressions1");
        String inputExpression="{{}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
   
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCorrectExpressions2() {
        System.out.println("testCorrectExpressions2");
        String inputExpression="{{(2+1)[]}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
    
        assertEquals(expResult, result);
        
    }
        public void testCorrectExpressions3() {
        System.out.println("testCorrectExpressions3");
        String inputExpression="()()(){}{}[({})]";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
   
        assertEquals(expResult, result);
       
    }
    
}
