package com.shape.SHAPES;

import javafx.scene.shape.Shape;

public class Square extends sh1 {

    private double sideLength;

    public double calculatePerimeter(){
        return sideLength * 4;
    }

    public double calculateSurface(){
        return sideLength * sideLength;
    }

}
