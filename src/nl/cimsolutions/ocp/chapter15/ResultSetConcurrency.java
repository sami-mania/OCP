/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter15;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author S.Rahman
 */
public class ResultSetConcurrency {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
//        Statement stmt = con.createStatement();
        DatabaseMetaData dbmd = con.getMetaData();
        
        if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
            System.out.print("Supports TYPE_FORWARD_ONLY");
            if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                System.out.println(" and supports CONCUR_UPDATABLE");
            }
        }
        
        if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
            System.out.print("Supports TYPE_SCROLL_INSENSITIVE");
            if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                System.out.println(" and supports CONCUR_UPDATABLE");
            }
        }
        
        if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
            System.out.print("Supports TYPE_SCROLL_SENSITIVE");
            if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                System.out.println("Supports CONCUR_UPDATABLE");
            }
        }
    }
}
