/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

/**
 *
 * @author S.Rahman
 */
public class TokenizingUsingSplit {
    public static void main(String[] args) {
        String[] tokens = args[0].split(args[1]);
        System.out.println("count: " + tokens.length);
        for(String s: tokens){
            System.out.println(">" + s + "<");
        }
    }
}
