package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public class CirleFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod(String aName) {
        return new Circle(aName + " (created by CirleFactory)");
    }
}
