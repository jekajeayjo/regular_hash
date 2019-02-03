/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class testCorrectExpressions {
    
    public testCorrectExpressions() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testStringCheck1() {
        System.out.println("stringCheck1");
        String inputExpression="{{}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
   
        assertEquals(expResult, result);
        
    }
    @Test
    public void testStringCheck2() {
        System.out.println("stringCheck2");
        String inputExpression="{{(2+1)[]}}";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
    
        assertEquals(expResult, result);
        
    }
        public void testStringCheck3() {
        System.out.println("stringCheck3");
        String inputExpression="()()(){}{}[({})]";
        
        Brackets instance = new Brackets(inputExpression);
        boolean expResult = true;
        boolean result = instance.stringCheck(inputExpression);
        System.out.println(result);
   
        assertEquals(expResult, result);
       
    }
    
}
