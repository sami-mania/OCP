/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S.Rahman
 */
public class RegexTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);                         //String to search
        System.out.println("\nSource         : " + args[1]);             
        System.out.println("Index          : 0123456789\n");      //the index
        
        System.out.println("Expression     : " + m.pattern());
        System.out.print("Match Positions: ");
        while(m.find()){
            System.out.print(m.start() + " "); 
        }
        System.out.println("");
    }
}
