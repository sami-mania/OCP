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
public class InsertNewRows {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookSellerDB", "OCP", "ocp");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT * FROM \"Customer\"";
//            System.out.println("SELECT * FROM Customer");
            ResultSet rs = statement.executeQuery(query);
//            rs.next();
            rs.absolute(2);
            rs.moveToCurrentRow();
            rs.updateInt("CustomerID", 20);
            rs.updateString("FirstName", "abdul");
            rs.updateString("LastName", "halinm");
            rs.updateString("Email", "abdul.halim@gamil.com");
            rs.updateString("PhoneNumber", "+316229093453");
            rs.insertRow();
            rs.beforeFirst();

            while (rs.next()) {
                System.out.println(rs.getInt("CustomerID") + " ");
                System.out.println(rs.getString("FirstName") + " ");
                System.out.println(rs.getString("LastName") + " ");
                System.out.println(rs.getString("Email") + " ");
                System.out.println(rs.getString("PhoneNumber") + " ");
            }



    }
}
