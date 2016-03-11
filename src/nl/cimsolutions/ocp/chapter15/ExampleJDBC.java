/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author S.Rahman
 */
public class ExampleJDBC {

    public static void main(String args[]) {
        System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookSellerDB", "OCP", "ocp");
            statement = connection.createStatement();
            String query = "SELECT * FROM \"Customer\"";
            System.out.println("SELECT * FROM Customer;");
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getInt("CustomerID") + " ");
                System.out.println(rs.getString("First Name") + " ");
                System.out.println(rs.getString("Last Name") + " ");
                System.out.println(rs.getString("Email") + " ");
                System.out.println(rs.getString("Phone") + " ");
            }
           
            rs.close();
            statement.close();
            connection.close();
            
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
        if(connection != null){
            System.out.println("\nYou made it, take control your database now!");
        }else{
            System.out.println("Failed to make connection!!");
        }
    }

}
