package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public abstract class ShapeFactory {
    private static Shape s;

    protected ShapeFactory() {
    }

    protected abstract Shape factoryMethod(String aName);

    public void anOperation(String aName) {
        Shape s = factoryMethod(aName);
        System.out.println("The current shape is: " + s.name);
        s.draw();
        s.erase();
    }

    static Shape factoryMethod(String aName, String aType) throws NoThisShape {
        if (aType.compareTo("square") == 0) {
            return new Square(aName);
        } else if (aType.compareTo("circle") == 0) {
            return new Circle(aName);
        } else throw new NoThisShape(aType);
    }

    static void anOperation(String aName, String aType) throws NoThisShape {
        s = factoryMethod(aName, aType);
        System.out.println("The current shape is: " + s.name);
        s.draw();
        s.erase();
    }
}
