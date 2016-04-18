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
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author S.Rahman
 */
public class AttributeInterfaces {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("manifest.mf");
        BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create: " + basic.creationTime());
        System.out.println("access: " + basic.lastAccessTime());
        System.out.println("modify: " + basic.lastModifiedTime());
        System.out.println("directory: " + basic.isDirectory());
        
        FileTime lastUpdated = basic.lastModifiedTime();
        FileTime created = basic.creationTime();
        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastUpdated, now, created);
        
        System.out.println("\n\n");
        System.out.println();
        System.out.println("create: " + created);
        System.out.println("access: " + basic.lastAccessTime());
        System.out.println("modify: " + lastUpdated);
        System.out.println("directory: " + basic.isDirectory());
    }
}
