package com.pool.eager_initialization;

public class EagerSingletonDriverClient {
    public static void main(String[] args) {
        EagerSingletonDriver connectionOne=EagerSingletonDriver.getEagerSingletonDriver();
        System.out.println(connectionOne);
        System.out.println("===================");
        EagerSingletonDriver connectionTwo=EagerSingletonDriver.getEagerSingletonDriver();
        System.out.println(connectionTwo);
    }
}
