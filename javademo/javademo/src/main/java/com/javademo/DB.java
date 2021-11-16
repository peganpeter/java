package com.javademo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

     final String JDBC_DRIVER = "org.h2.Driver";
     final String URL = "jdbc:h2:~/test";
     final String USERNAME = "sa";
     final String PASSWORD = "";


    public DB() {
        try {
            Connection conn = DriverManager.getConnection(URL + USERNAME);
            System.out.println("Database connection created.");
        } catch (SQLException e) {
            System.out.println(""+e);
        }
    }

}
