package com.steve.muish.beanlifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class MemeberDAO {

    //Deffining the dependencies
    private String url;
    private String userName;

    private String userPassword;

    //injecting the dependencies
    @Value("${memberDAO.url}")
    public void setUrl(String url) {
        this.url = url;
    }

    @Value("${memberDAO.userName}")
    public void setUserName(String userName) {
        System.out.println("in the userName function.");
        this.userName = userName;
    }

    @Value("${memberDAO.userPassword}")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    //instance variables
    private Connection connection;

    private PreparedStatement prestmt;

    //Initializing the bean.
    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        createTheConnection();
    }

    //Creating the connection to the db
    public void createTheConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");

        connection = DriverManager.getConnection(url,userName,userPassword);
        System.out.println("Database Connection is a go!!!");
    }


    //database logic
    public void selectAllTable() throws Exception {
        String query = "SELECT * FROM  memeberTable";

        prestmt = connection.prepareStatement(query);

        ResultSet resultSet = prestmt.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("memberRegNo") + " \t " +
                    resultSet.getString("memeberName") + " \t " +
                    resultSet.getString("memeberAddress") + " \t ");
        }
    }

    //Disconnection the database.
    public void disconnectTheDatabase()throws Exception
    {
        prestmt.close();
        connection.close();
        System.out.println("The Database has being disconnected");
    }

    //destroy the bean.
    @PreDestroy
    public void destroy() throws Exception {
        disconnectTheDatabase();
    }
}
