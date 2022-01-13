package com.shape.SHAPES;

import com.shape.SHAPES.Circle;
import com.shape.SHAPES.Rectangle;
import com.shape.SHAPES.Square;

public class Parent {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        circle.calculatePerimeter();
        circle.calculateSurface();

        square.calculatePerimeter();
        square.calculateSurface();

        rectangle.calculatePerimeter();
        rectangle.calculatePerimeter();



    }

}
