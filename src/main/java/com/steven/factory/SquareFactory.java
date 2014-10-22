package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod(String aName) {
        return new Square(aName + " (created by SquareFactory)");
    }
}
