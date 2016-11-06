package figures;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by Family on 28.10.2016.
 */
public class Circle implements Shape {

    private double radius;
    public Circle(double circleRadius){
        radius = circleRadius;
    }

    public void action(){
        System.out.println("Area of circle = " + calculateArea());
        System.out.println("Perimetr of circle = " + calculatePerimeter());
    }

    public double calculateArea() {
       return PI*pow(radius,2);
    }

    public double calculatePerimeter() {
       return 2*PI*radius;
    }
}
