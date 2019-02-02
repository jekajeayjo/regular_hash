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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        char elementOfOpenParent;
        char elementOfCloseParent = 0;
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        hm.put(']', '[');
        hm.put(')', '(');
        hm.put('}', '{');
        Stack<Character> stack = new Stack();
        Set<Map.Entry<Character, Character>> set = hm.entrySet();
        String inputExpression = "(){{}][]";
        elementOfOpenParent = inputExpression.charAt(0);
        Block_Paren:
        {
        for (int i = 0; i < inputExpression.length(); i++) {
            for (Map.Entry<Character, Character> mapEntry : set) {
                if (inputExpression.charAt(i) == mapEntry.getValue()) {
                    stack.push(inputExpression.charAt(i));
                    System.out.println("is push " + inputExpression.charAt(i));
                    elementOfOpenParent = inputExpression.charAt(i);
                    System.out.println(elementOfOpenParent);
                } else if (inputExpression.charAt(i) == mapEntry.getKey()) {
                    if (stack.lastElement() == mapEntry.getValue()) {
                        stack.pop();
                        System.out.println("Is pop");
                    }
                    else
                        break Block_Paren;
                }
            }
        }
        }
        System.out.println(stack.isEmpty());
    }
}
