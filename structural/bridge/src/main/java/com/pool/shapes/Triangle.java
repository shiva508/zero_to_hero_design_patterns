package com.pool.shapes;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triagnle is drown,"+color.fill();
    }
}
