/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author S.Rahman
 */
public class ResourceBundleTest{
    public static void main(String[] args) {
//        Locale locale = new Locale(args[0]);
        Locale loc = new Locale("fr","FR");
        ResourceBundle rb = ResourceBundle.getBundle("Labels", loc);
        System.out.println(rb.getString("hello"));
    }
}
