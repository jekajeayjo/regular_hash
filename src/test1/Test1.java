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
        char c;
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        hm.put(']', '[');
        hm.put(')', '(');
        hm.put('}', '{');
        Stack<Character> stack = new Stack();
        Set<Map.Entry<Character, Character>> set = hm.entrySet();
        String st = "[]";

        for (int i = 0; i < st.length(); i++) {
            for (Map.Entry<Character, Character> me : set) {
                c=st.charAt(i);
                if (st.equals(me.getValue())) 
                {
                    stack.push(c);
                }
                else if (st.equals(me.getKey()))
                    stack.peek();
            }
        }
        
        System.out.println(stack.isEmpty());

    }
}
