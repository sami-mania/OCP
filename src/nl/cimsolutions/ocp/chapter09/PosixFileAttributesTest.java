/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class PosixFileAttributesTest {
    public static void main(String[] args){       
        try {
            Path path = Paths.get("temp.txt");
            Files.createFile(path);
            PosixFileAttributes posix = Files.readAttributes(path,PosixFileAttributes.class);
            
            Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
            Files.setPosixFilePermissions(path, perms);
            System.out.println(posix.permissions());
            System.out.println(posix.group());
        } catch (IOException ex) {
            Logger.getLogger(PosixFileAttributesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
