/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author S.Rahman
 */
public class DateUsingCalendarTest {
    public static void main(String[] args) {
        Date d3 = new Date(1_000_000_000_000L);
        System.out.println("1st Date: " + d3.toString());
        
        Calendar c = Calendar.getInstance();
        c.setTime(d3);                  //#1
        
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){           //#2
            System.out.println("Sunday is the Firstday of the week");            
        }
        System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK));  //#3
        c.add(Calendar.MONTH, 1);               //#4
        Date d4 = c.getTime();                  //#5
        System.out.println("New Date: " + d4.toString());
   }
}