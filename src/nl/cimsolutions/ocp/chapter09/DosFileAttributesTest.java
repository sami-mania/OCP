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
import java.nio.file.attribute.DosFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class DosFileAttributesTest {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("file1");
//        Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            Files.setAttribute(path, "dos:hidden", false);
            Files.setAttribute(path, "dos:readonly", false);

            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
        } catch (IOException ex) {
            Logger.getLogger(DosFileAttributesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
