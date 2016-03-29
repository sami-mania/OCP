/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.Scanner;

/**
 *
 * @author S.Rahman
 */
public class ScannerTokenizer {

    public static void main(String[] args) {
        System.out.print("Input: ");
        System.out.flush();
        try {
            Scanner s = new Scanner(System.in);
            String token;
            do {
                token = s.findInLine(args[0]);
                System.out.println("found " + token);
            } while (token != null);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
