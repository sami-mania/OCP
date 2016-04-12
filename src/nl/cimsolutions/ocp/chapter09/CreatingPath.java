/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author S.Rahman
 */
public class CreatingPath {
    public static void main(String[] args) throws IOException {
        
        //I/O approach
        File file = new File("test2.txt");
        file.createNewFile();
        
        //NIO.2 approach
        Path p = Paths.get("test.txt");
        Files.createFile(p);
        
        
    }
}
