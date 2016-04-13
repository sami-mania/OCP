/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author S.Rahman
 */
public class PathInfo {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\S.Rahman\\Documents\\NetBeansProjects\\OCP");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getName(1): " + path.getName(1));
        System.out.println("getNameCount: " + path.getNameCount());     // number of name elements in the path. here in the path 5 elements(Users, S.Rahman, Documents, NetBeansProjects, OCP, src)
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("subpath(0,2): " + path.subpath(0, 2));
        System.out.println("toString: " + path.toString());

        System.out.println("\n\n\n\n");

        int spaces = 1;
        Path path2 = Paths.get("Users", "S.Rahman", "Documents", "NetBeansProjects", "OCP");
        for (Path subpath : path2) {
            System.out.format("%" + spaces + "s%s%n", "", subpath);
            spaces += 3;
        }

        //path normalization
        System.out.println(Paths.get("/a/./b/./c").normalize());
        System.out.println(Paths.get(".classpath").normalize());
        System.out.println(Paths.get("/a/b/c/..").normalize());
        System.out.println(Paths.get("../a/b/c").normalize());
        System.out.println("\n\n\n");
        
        //resolving a path
        Path absolute = Paths.get("/home/java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("Model.pdf");
        System.out.println("\n\n\n");
        
        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(file));
        System.out.println("3: " + relative.resolve(file));
        System.out.println("4: " + relative.resolve(absolute));     //BAD example
        System.out.println("5: " + file.resolve(absolute));         //BAD example
        System.out.println("6: " + file.resolve(relative));     //BAD example
        System.out.println("\n\n");
        
        
        //Relativizing a Path
        Path dir = Paths.get("/home/java");
        Path music = Paths.get("/home/java/country/Swift.mp3");
        Path mp3 = dir.relativize(music);
        System.out.println(mp3);
        
        System.out.println("\n\n");
        Path absolute1 = Paths.get("/home/java");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/java/temp/music.mp3");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/music.pdf");
        
        System.out.println("1: " + absolute1.relativize(absolute3));
        System.out.println("2: " + absolute3.relativize(absolute1));
        System.out.println("3: " + absolute1.relativize(absolute2));
        System.out.println("4: " + relative1.relativize(relative2));
        System.out.println("5: " + absolute1.relativize(relative1));          //BAD
        
    }
}
