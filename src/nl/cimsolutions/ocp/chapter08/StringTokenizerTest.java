/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.StringTokenizer;

/**
 *
 * @author SAMI
 */
public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("a bc d e");
        System.out.println("\n " + st1.countTokens());
        while (st1.hasMoreTokens()) {            
            System.out.print(">" + st1.nextToken() + "<\t");
        }
        System.out.println("\n " + st1.countTokens());
        
        StringTokenizer st2 = new StringTokenizer("ab cab a ba d", "a");
        System.out.println("\n " + st2.countTokens());
        
        while (st2.hasMoreTokens()) {            
            System.out.print(">" + st2.nextToken() + "<\t");
        }
        System.out.println("\n " + st2.countTokens());
    }
}
