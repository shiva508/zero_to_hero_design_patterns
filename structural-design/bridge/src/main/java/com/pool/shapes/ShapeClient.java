package com.pool.shapes;

public class ShapeClient {
    public static void main(String[] args) {
        Shape triangle=new Triangle(new Red());
        System.out.println(triangle.draw());
    }
}
