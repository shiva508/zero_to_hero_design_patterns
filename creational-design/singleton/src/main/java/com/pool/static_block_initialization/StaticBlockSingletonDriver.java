package com.pool.static_block_initialization;

public class StaticBlockSingletonDriver {

    private static StaticBlockSingletonDriver staticBlockSingletonDriver;
    private StaticBlockSingletonDriver(){
    }
    static {
        System.out.println("STATIC BLOCK IS CALLED");
        staticBlockSingletonDriver=new StaticBlockSingletonDriver();
    }
    public static StaticBlockSingletonDriver getStaticBlockSingletonDriver(){
        return staticBlockSingletonDriver;
    }
}
