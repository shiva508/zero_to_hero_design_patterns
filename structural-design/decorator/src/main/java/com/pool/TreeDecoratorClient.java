package com.pool;

public class TreeDecoratorClient {
    public static void main(String[] args) {
        ChristmasTree christmasTree=new BubbleLights(new ChristmasTreeImpl());
        System.out.println(christmasTree.decorate());
        ChristmasTree christmasTreeGarland= new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(christmasTreeGarland.decorate());
    }
}