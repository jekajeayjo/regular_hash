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
 * @author User
 */
public class Parenthes {

    //private String inputExpression;
    private char elementOfOpenParent;
    private char elementOfCloseParent = 0;
    private HashMap<Character, Character> hm = new HashMap<Character, Character>();
    private Stack<Character> stack = new Stack();
    private Set<Map.Entry<Character, Character>> set = hm.entrySet();
    // String inputExpression = "(){{}][]";

    Parenthes(String inputExpression) {

        hm.put(']', '[');
        hm.put(')', '(');
        hm.put('}', '{');
        elementOfOpenParent = inputExpression.charAt(0);
        stringCheck(inputExpression);
    }

    boolean stringCheck(String inputExpression) {

        for (int i = 0; i < inputExpression.length(); i++) {
            for (Map.Entry<Character, Character> mapEntry : set) {
                if (inputExpression.charAt(i) == mapEntry.getValue()) {
                    stack.push(inputExpression.charAt(i));
                    elementOfOpenParent = inputExpression.charAt(i);
                } else if (inputExpression.charAt(i) == mapEntry.getKey()) {
                    if (stack.lastElement() == mapEntry.getValue()) {
                        stack.pop();
                    } else {
                        System.out.println("Не верно");
                        return false;
                    }
                }
            }
        }
        System.out.println("Верно");
        return true;

    }

}
