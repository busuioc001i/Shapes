package com.shape.SHAPES;

public class Rectangle extends sh1{

    private double length;
    private double width;

    public double calculatePerimeter(){
        return length * 2 + width * 2;
    }

    public double calculateSurface(){
        return length * width;
    }

}
