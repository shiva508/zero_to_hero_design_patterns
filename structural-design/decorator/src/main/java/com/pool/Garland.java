package com.pool;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    @Override
    public String decorate() {
        return super.decorate()+ this.decorateWithGarland();
    }

    public String decorateWithGarland(){
        return " With Garland ";
    }
}
