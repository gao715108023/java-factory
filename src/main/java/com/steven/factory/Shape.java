package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public abstract class Shape {

    public abstract void draw();

    public abstract void erase();

    public String name;

    protected Shape(String name) {
        this.name = name;
    }
}
