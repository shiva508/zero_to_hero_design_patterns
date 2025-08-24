package com.pool.available;

public class RuntimeSingletonInfo {
    public static void main(String[] args) {
        Runtime runtimeOne = Runtime.getRuntime();
        Runtime runtimeTwo = Runtime.getRuntime();
        System.out.println("Runtime One HashCode: " + runtimeOne.hashCode());
        System.out.println("Runtime Two HashCode: " + runtimeTwo.hashCode());
        if (runtimeOne == runtimeTwo) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("References point to different instances.");
        }
    }
}
