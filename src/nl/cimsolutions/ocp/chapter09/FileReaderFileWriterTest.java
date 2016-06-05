/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author S.Rahman
 */
public class FileReaderFileWriterTest {

    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;

        try {
            File file = new File("fileWriter1.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("howdy\nfolks\n");

            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            size = fr.read(in);
            System.out.print(size + " ");
            for (char c : in) {
                System.out.print(c);
            }  
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
