package com.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgres {
    private static Connection connection;
    private Postgres(){

    }

    public static Connection getPostgresConnection(){
        if (null ==connection){
            try {
                Class.forName("org.postgresql.Driver");
                connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/keycloak","keycloak","keycloak");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
