/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.Console;

/**
 *
 * @author S.Rahman
 */
public class ConsoleTest {

    public static void main(String[] args) {
        String name = "";
        Console c = System.console();
        char[] pw;
        try {
            pw = c.readPassword("%s", "pw: ");
            for (char ch : pw) {
                c.format("%c ", ch);
            }
            c.format("\n");
            MyUtility mu = new MyUtility();
            while (true) {
                name = c.readLine("%s", "input?: ");
                c.format("output: %s \n", mu.doStuff(name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyUtility {

    String doStuff(String arg1) {
        return "return is " + arg1;
    }
}
