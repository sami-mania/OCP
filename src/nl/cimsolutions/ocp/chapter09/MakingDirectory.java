/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class MakingDirectory {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            File existingDir = new File("existingDir");
//            existingDir.mkdir();                      //creating directory
            System.out.println(existingDir.isDirectory());
            File existingDirFile = new File(existingDir, "existingDirFile.txt");
//            existingDirFile.createNewFile();          //Creating file
            System.out.println(existingDirFile.isFile());
            fr = new FileReader(existingDirFile);
            br = new BufferedReader(fr);

            String s;
            try {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException ex) {
                Logger.getLogger(MakingDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MakingDirectory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                fr.close();
                
            } catch (IOException ex) {
                Logger.getLogger(MakingDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
