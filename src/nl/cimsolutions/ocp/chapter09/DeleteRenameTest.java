/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author S.Rahman
 */
public class DeleteRenameTest {
    public static void main(String[] args) throws IOException {
        File delDir = new File("delDir");
        delDir.mkdir();
        
        File delFile1 = new File(delDir,"delFile1.txt");
        delFile1.createNewFile();
        
        File delFile2 = new File(delDir, "delFile2.txt");
        delFile2.createNewFile();
        
        delFile1.delete();
        System.out.println("delDir is");
        System.out.println("");
        
    }
}
