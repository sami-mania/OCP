/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author S.Rahman
 */
public class GetTableName {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        String dbConnectionString = "jdbc:derby://localhost:1527/sample";
        String userName = "app";
        String password = "app";
        con = DriverManager.getConnection(dbConnectionString, userName, password);
        String query = "SELECT CUSTOMER.CUSTOMER_ID, DISCOUNT_CODE.DISCOUNT_CODE FROM CUSTOMER, DISCOUNT_CODE WHERE CUSTOMER.DISCOUNT_CODE = DISCOUNT_CODE.DISCOUNT_CODE AND ";
    }
}
