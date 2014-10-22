package com.steven.factory;

/**
 * @author gaochuanjun
 * @since 14/10/20
 */
public class Main {

    public static void main(String[] args) throws NoThisShape {
        //ShapeFactory sf1 = new SquareFactory();
        //ShapeFactory sf2 = new CirleFactory();
        //sf1.anOperation("Shape One");
        //sf2.anOperation("Shape two");

        ShapeFactory.anOperation("Shape one", "circle");
        ShapeFactory.anOperation("Shape two", "square");
        ShapeFactory.anOperation("Shape three", "delta");
    }
}
