/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author S.Rahman
 */
public class SetTest {
    public static void main(String args[]){
        boolean [] ba = new boolean[5];
        Set s1 = new HashSet();
//        Set s2 = new TreeSet();
        
//        accessing HashSet value
        ba[0] = s1.add("a");
        ba[1] = s1.add(new Integer(42));
        ba[2] = s1.add("b");
        ba[3] = s1.add("a");
        ba[4] = s1.add(new Object());
        
//        accessing TreeSet valus
//        ba[0] = s2.add("a");
//        ba[1] = s2.add(new Integer(42));
//        ba[2] = s2.add("b");
//        ba[3] = s2.add("a");
//        ba[4] = s2.add(new Object());
//        ba[5] = s.add("c");
        
        System.out.println(s1.size());
        for(int x=0;x<ba.length;x++)
            System.out.print(ba[x] + " ");
        System.out.println();
        for(Object o: s1)
            System.out.println(o + " ");
    }
}