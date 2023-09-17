package com.pool.thread_safe_singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadSafeMySqlConnection {
    private static Connection connection;

    private ThreadSafeMySqlConnection(){
    }
    public static synchronized Connection getConnection(){
        if(null ==connection){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva_508", "root", "root");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
