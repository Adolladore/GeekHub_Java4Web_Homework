package figures;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/**
 * Created by Family on 28.10.2016.
 */
public class Square implements Shape {
    double a;
    double b;
    String figure = "square";

    public Square(double sideA) {
        a = sideA;
        b = a;
    }

    public void action() {
        System.out.println("Area of " + figure + " = " + (calculateArea()));
        calculateArea();
        System.out.println("Perimeter of " + figure + " = " + calculatePerimeter());
        calculatePerimeter();
        getTriangleInSquare();
    }

    public void getTriangleInSquare(){
        System.out.println("This " + figure + " consists of a two triangles with 2 cathetus: "
                + a + " and " + b + " and hypotenuse: " + sqrt(a*a+b*b) );
    }

    public double calculateArea() {
        return a*b;
    }

    public double calculatePerimeter() {
        return (a+b)*2;
    }
}
