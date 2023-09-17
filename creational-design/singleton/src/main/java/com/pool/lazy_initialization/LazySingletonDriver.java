package com.pool.lazy_initialization;

import java.sql.Connection;

public class LazySingletonDriver {
    public static void main(String[] args) {
        Connection connectionOne=MySqlConnection.getMySqlConnection();
        System.out.println(connectionOne);
        Connection connectionTwo=MySqlConnection.getMySqlConnection();
        System.out.println(connectionTwo);
    }
}
