package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public class Circle extends Shape{

    protected Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("It will draw a circle.");
    }

    @Override
    public void erase() {
        System.out.println("It will erase a circle.");
    }
}
