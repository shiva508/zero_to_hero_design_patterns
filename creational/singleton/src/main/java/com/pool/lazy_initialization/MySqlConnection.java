package com.pool.lazy_initialization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    private static Connection connection;

    private MySqlConnection(){

    }
    public static Connection getMySqlConnection() {
        if(null ==connection){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva_508", "root", "root");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
