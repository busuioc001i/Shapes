package com.shape.SHAPES;
import java.util.Scanner;


public class Circle extends sh1{

    private double radius;
    double pi = 3.14,perim;
    Scanner s = new Scanner(System.in);



    public double calculatePerimeter(){

        System.out.print("Enter radius of circle:");
        radius = s.nextInt();
        perim = 2 * pi * radius;
        System.out.println("Perimeter of circle:"+perim);
        return 0;
    }

    public double calculateSurface(){
        return 0;
    }

}
