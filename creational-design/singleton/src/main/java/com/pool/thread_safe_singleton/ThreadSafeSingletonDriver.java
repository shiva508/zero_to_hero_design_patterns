package com.pool.thread_safe_singleton;

import java.sql.Connection;

public class ThreadSafeSingletonDriver {
    public static void main(String[] args) {
        Connection connectionOne=ThreadSafeMySqlConnection.getConnection();
        System.out.println(connectionOne);
        Connection connectionTwo=ThreadSafeMySqlConnection.getConnection();
        System.out.println(connectionTwo);
    }
}
