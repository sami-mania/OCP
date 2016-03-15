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
public class DisplayTableData {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        Statement stmt = con.createStatement();
        String query = "SELECT * from CUSTOMER";
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnNumber = rsmd.getColumnCount();
        String col, colData;

        for (int i = 1; i <= columnNumber; i++) {
            col = leftJustifty(rsmd.getColumnName(i), rsmd.getColumnDisplaySize(i));
            System.out.print(col);
        }

        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= columnNumber; i++) {
                if (rs.getObject(i) != null) {
                    colData = rs.getObject(i).toString();
                } else {
                    colData = "NULL";
                }
                
                col = leftJustifty(colData, rsmd.getColumnDisplaySize(i));
                System.out.print(col);
            }
            
            System.out.println();
        }
    }

    private static String leftJustifty(String s, int n) {
        if (s.length() <= n) {
            n +=1;
        }
        return String.format("%1$-" + n + "s", s);
    }
}
