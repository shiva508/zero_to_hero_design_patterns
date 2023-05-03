package com.pool;

import java.sql.Connection;

public class PostgresConnection implements DatabaseConnection{
    @Override
    public Connection getConnection() {
        return Postgres.getPostgresConnection();
    }
}
