/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author S.Rahman
 */
public class BackedCollectionsTest {
    public static void main(String args[]){
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");
        
        SortedMap<String, String> submap;
        submap = map.subMap("b", "g");
        System.out.println("map:    " + map + "\nsubmap: " + submap);
        
        map.put("b", "bat");
        submap.put("f", "fish");
        
        map.put("r", "raccoon");
//        submap.put("p", "pig");
        
        System.out.println("map   : " + map + "\n" + "submap: " + submap);
    }
}