package com.pool.eager_initialization;

public class EagerSingletonDriver {

    private static final EagerSingletonDriver CONNECTION=new EagerSingletonDriver();
    private EagerSingletonDriver(){

    }
    public static EagerSingletonDriver getEagerSingletonDriver(){
        return CONNECTION;
    }

}
