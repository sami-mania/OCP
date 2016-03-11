/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author S.Rahman
 */
public class DerbyDB {
    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from CUSTOMER");
        ResultSetMetaData rsmd = rs.getMetaData();
        int colms = rsmd.getColumnCount();
        int[] colsArr= new int[colms];
        
        for (int i = 1; i <= colms; i++) {
            colsArr[i-1]= rsmd.getColumnDisplaySize(i);
            System.out.printf("%-"+colsArr[i-1]+"s", rsmd.getColumnName(i));
        }
        
        System.out.println();
        
        while(rs.next()){
             for (int i = 1; i <= colms; i++) {
                 System.out.printf("%-"+colsArr[i-1]+"s",  rs.getString(i));
             }
             System.out.println();
        }
    }
}