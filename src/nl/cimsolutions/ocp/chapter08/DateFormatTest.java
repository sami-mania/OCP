/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date d5 = new Date(1_000_000_000_000L);
        DateFormat [] dateFormat = new DateFormat[6];
        dateFormat[0] = DateFormat.getInstance();
        dateFormat[1] = DateFormat.getDateInstance();
        dateFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for(DateFormat df1 : dateFormat){
            System.out.println(df1.format(d5));
        }
        
        System.out.println();
        System.out.println();
        
        Date d6 = new Date(1_000_000_000_000L);
        System.out.println("d6: " + d6.toString());
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
        
        String s = df2.format(d6);
        System.out.println(s.toString());
        
        try {
            Date d7 = df2.parse(s);
            System.out.println("parsed: " + d7.toString());
        } catch (ParseException ex) {
//            Logger.getLogger(DateFormatTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("parse exception" + ex.getMessage());
        }
    }
}
