/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author S.Rahman
 */
public class SearchObjArray {
    public static void main(String args[]){
        String [] sa = {"one", "two", "three", "four"};
        
        Arrays.sort(sa);
        for(String s: sa)
            System.out.print(s + " ");
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
        
        System.out.println("now reverse sort");
        
        ReverseSortComparator rs = new ReverseSortComparator();
        Arrays.sort(sa, rs);
        for(String s:sa)
            System.out.print(s + " ");
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
        System.out.println("one = " + Arrays.binarySearch(sa, "one", rs));      
    }   
    static class ReverseSortComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }       
    }
}
