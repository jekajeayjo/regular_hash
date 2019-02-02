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
        char elementOfCloseParent= 0;
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        hm.put(']', '[');
        hm.put(')', '(');
        hm.put('}', '{');
        Stack<Character> stack = new Stack();
        Set<Map.Entry<Character, Character>> set = hm.entrySet();
        String st = "{}";
        elementOfOpenParent = st.charAt(0);
        for (int i = 0; i < st.length(); i++) {
            for (Map.Entry<Character, Character> me : set) {
                if (st.charAt(i) == me.getValue()) {
                    stack.push(st.charAt(i));
                    System.out.println("is push "+st.charAt(i));
                    System.out.println(elementOfOpenParent);
                } else if (st.charAt(i) == me.getKey() && elementOfOpenParent == me.getValue()) {
                    stack.pop();
                    System.out.println("Is pop");
                }
                elementOfOpenParent = st.charAt(i);
            }
           
        }
        System.out.println(stack.isEmpty());
    }
}
