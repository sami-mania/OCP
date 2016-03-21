/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.util.Date;

/**
 *
 * @author S.Rahman
 */
public class TestDates {
    public static void main(String[] args) {
        Date d1 = new Date(1_000_000_000_000L);
        System.out.println("1st date: " + d1.toString());
        d1.setTime(d1.getTime() + 3_600_000);
        System.out.println("new Time: " + d1.toString());
        Date now = new Date();        
        System.out.println("Now Date is: " + now.getTime());
    }
}
