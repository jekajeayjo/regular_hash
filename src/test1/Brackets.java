/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Baldji Eughen
 * @version 1.3
 * since 1.0
 * This class Brackets which add input  open bracket in array and check with close bracket 
 *the class contains hashmap in which there is open bracket and close bracke for check input values
 */
public class Brackets {

    //private String inputExpression;
    private char openBracket;
    private char closeBracket = 0;
    private HashMap<Character, Character> hm = new HashMap<Character, Character>();
    private Stack<Character> stack = new Stack();
    private Set<Map.Entry<Character, Character>> set = hm.entrySet();
    // String inputExpression = "(){{}][]";
/**
 *  hashMap add open and close bracket which will be check from input values  using the  Constructor 
 * @param inputExpression  the field will be to use for input values which will be to check
 */
    Brackets() 
    {
        hm.put(']', '[');
        hm.put(')', '(');
        hm.put('}', '{');
      
       // stringCheck(inputExpression);
    }
/**
 * <strong>stringCheck</strong> the method checks brackets in array on the right amount
 * @param inputExpression
 * @return true or false in boolean type 
 */
    boolean stringCheck(String inputExpression) 
    {
          openBracket = inputExpression.charAt(0);

        for (int i = 0; i < inputExpression.length(); i++) 
        {
            for (Map.Entry<Character, Character> mapEntry : set) 
            {
                if (inputExpression.charAt(i) == mapEntry.getValue()) 
                {
                    stack.push(inputExpression.charAt(i));
                    openBracket = inputExpression.charAt(i);
                } 
                else if (inputExpression.charAt(i) == mapEntry.getKey()) 
                {
                    if (stack.lastElement() == mapEntry.getValue()) 
                    {
                        stack.pop();
                    } 
                    else {
                        System.out.println("Не верно");
                        return false;
                    }
                }
            }
        }
        if (!stack.isEmpty())
        {
            System.out.println("Не верно");
            return false;
        }           
        else{
        System.out.println("Верно");
        return true;
        }

    }

}
