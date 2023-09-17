package com.pool;

import java.sql.Connection;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public Connection getConnection() {
        return MySql.getMySqlConnection();
    }
}
