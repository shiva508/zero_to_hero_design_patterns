package com.pool.shapes;

public class Square extends  Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square is drown,"+color.fill();
    }
}
