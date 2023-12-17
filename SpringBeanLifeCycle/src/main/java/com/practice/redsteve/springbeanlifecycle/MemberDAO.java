package com.practice.redsteve.springbeanlifecycle;

import javax.swing.*;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

    Connection connection;
    PreparedStatement preStatement;


    //register and load the drivers.
    public void createConnection() throws Exception
    {
        String url = "jdbc:mariadb://127.0.0.1:3306/trasportCompanySchema";
        String userName = "steve";
        String password = "sijui!";

        //load the driver
        Class.forName("org.mariadb.jdbc.Driver");


        //create the connection.
        connection = DriverManager.getConnection(url,userName,password);
        System.out.println("The JDBC connection is Connected Successfully.");
    }

    public void readTable(String tableName)throws Exception {
        String query = "SELECT * FROM " + tableName;

        //load the query
        preStatement = connection.prepareStatement(query);

        //take in the returned table;
        ResultSet resultSet = preStatement.executeQuery();

        //display the returned information.

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(3) +
                    " " + resultSet.getString(3) + " " + resultSet.getInt(4));
        }
    }

    public void deleteMember(String memberId)throws Exception
    {
        String query = "DELETE FROM memeberTable WHERE memberRegNo = ? ";

        preStatement = connection.prepareStatement(query);

        preStatement.setString(1,memberId);
        int rowsAffected = preStatement.executeUpdate();

        System.out.println("Deleted successfully, " +rowsAffected+ " row affected.");
    }

    public void closeConnection()throws Exception
    {
        preStatement.close();
        connection.close();
    }
}
