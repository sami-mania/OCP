/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author S.Rahman
 */
public class FilesLastModifiedDates {

    public static void main(String[] args) throws IOException {
        Date januaryFirst = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();
//        String path1 = "C:" + File.separator + "temp" + File.separator + "file1.txt";
        // Use relative path for Unix systems
//        File f = new File(path);
        File file1 = new File("file1");
        file1.createNewFile();
        file1.setLastModified(januaryFirst.getTime());
        System.out.println(file1.lastModified());
//        file1.delete();

//        String path2 = "C:" + File.separator + "temp" + File.separator + "file2.txt";
//// Use relative path for Unix systems
//        File file2 = new File("file2");
        Path p = Paths.get("file2");
        Files.createFile(p);
        FileTime fileTime = FileTime.fromMillis(januaryFirst.getTime());
        Files.setLastModifiedTime(p, fileTime);
        System.out.println(Files.getLastModifiedTime(p));

    }
}
