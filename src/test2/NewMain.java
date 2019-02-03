/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String t="НачПериода";
        String period ="НачПериода1,НачПериода2,КонПериода1,КонПериода2,НачПериода3";
        Intersection  b =new Intersection();
        b.findAll(period);
      
        
    }
    
}
