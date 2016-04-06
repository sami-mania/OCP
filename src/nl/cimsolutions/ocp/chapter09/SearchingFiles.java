/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;

/**
 *
 * @author S.Rahman
 */
public class SearchingFiles {
    public static void main(String[] args) {
        String[] files = new String[100];
        File search = new File("searchThis");
        
        files = search.list();
        
        for(String fn: files){
            System.out.println("found " + fn);
        }
    }
}
