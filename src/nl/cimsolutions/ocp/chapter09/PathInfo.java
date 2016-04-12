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
        
        int spaces=1;
        Path path2 = Paths.get("Users","S.Rahman" , "Documents","NetBeansProjects","OCP");        
        for(Path subpath: path2){
            System.out.format("%" + spaces + "s%s%n","", subpath);
            spaces +=3;
        }
    }
}
