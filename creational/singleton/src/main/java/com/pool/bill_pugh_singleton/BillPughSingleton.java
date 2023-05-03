package com.pool.bill_pugh_singleton;

public class BillPughSingleton {
    private BillPughSingleton(){
    }
    private static class SingletonHelper {
        private static final BillPughSingleton BILL_PUGH_SINGLETON=new BillPughSingleton();
    }
    public static BillPughSingleton getBillPughSingletonInstance(){
        return SingletonHelper.BILL_PUGH_SINGLETON;
    }
}
