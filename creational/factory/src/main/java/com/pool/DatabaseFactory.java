package com.pool;

import java.sql.Connection;

public class DatabaseFactory {

    public DatabaseConnection getConnection(String type){
        Connection connection = null;
        if(type.equals("mysql") ){
            return new MySqlConnection();
        } else if (type.equals("postgres")) {
            return new PostgresConnection();
        }
        return null;
    }
}
