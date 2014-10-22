package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public class Square extends Shape{

    protected Square(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("It will draw a square.");
    }

    @Override
    public void erase() {
        System.out.println("It will erase a square.");
    }
}
