/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class Writer1 {
    public static void main(String args[]){
        try {
            boolean newFile = false;
            File file = new File("fileWriter1.txt");
            System.out.println(file.exists());
            
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
        } catch (IOException ex) {
            Logger.getLogger(Writer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
