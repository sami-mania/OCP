/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.Scanner;

/**
 *
 * @author SAMI
 */
public class TokenizingUsingScanner {
    public static void main(String[] args) {
        boolean b2, b1;
        int i;
        String s, hits =" ";
        Scanner s1 = new Scanner(args[0]);
        Scanner s2 = new Scanner(args[0]);
        
        while(b1=s1.hasNext()){
            s = s1.next();
            hits += "s";
        }
        
        while (b1=s2.hasNext()) {            
            if(s2.hasNextInt()){
                i=s2.nextInt();
                hits += "i";
            }else if(s2.hasNextBoolean()){
                b2 = s2.nextBoolean();
                hits += "b";
            }else{
                s2.next();
                hits +="s2";
            }
        }
        System.out.println("hits: " + hits);
    }
}