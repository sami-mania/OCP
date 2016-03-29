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
public class GroupTest{
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        System.out.println("\nSource: " + args[1]);
        System.out.println("index : 0123456789\n");
        System.out.println("Pattern: " + m.pattern());
        while(m.find()){
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
//        System.out.println("");
        
   }
}
