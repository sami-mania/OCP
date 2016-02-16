/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author S.Rahman
 */
public class ListToArray {
    public static void main(String args[]){
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            ls.add(i);
        Object [] oa = ls.toArray();
    
        Integer[] ia2 = new Integer[3];
        ia2 = ls.toArray(ia2);
        }
    }
}
