package com.pool;

import java.sql.Connection;

public interface DatabaseConnection {

    public Connection getConnection();
}
