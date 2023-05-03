package com.pool.static_block_initialization;

public class StaticBlockSingletonDriverClient {
    public static void main(String[] args) {
        StaticBlockSingletonDriver singletonDriverOne=StaticBlockSingletonDriver.getStaticBlockSingletonDriver();
        System.out.println(singletonDriverOne);
        StaticBlockSingletonDriver singletonDriverTwo=StaticBlockSingletonDriver.getStaticBlockSingletonDriver();
        System.out.println(singletonDriverTwo);
    }
}
