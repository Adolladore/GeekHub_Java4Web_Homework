package figures;

import constants.TriangleType;

import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Family on 28.10.2016.
 */
public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double sideA, double sideB, double sideC){
        a = sideA;
        b = sideB;
        c = sideC;
    }

    public void action() {
        TriangleType check = TriangleType.valueOf(classify(a,b,c));

        if (check == TriangleType.INVALID) {
            System.out.println("This triangle isn`t exist");
        } else {
            System.out.println("Your triangle is " + classify(a,b,c).toLowerCase());
            System.out.println("Area of triangle = " + calculateArea());
            System.out.println("Triangle perimeter = " + calculatePerimeter() );
        }
    }

    static String classify(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0){
            return "INVALID";
        } else if (a == b && b == c){
            return "EQUILATERAL";
        } else if (a >= b+c || c >= b+a || b >= a+c) {
            return "INVALID";
        } else if ((b==c) || (a==b) || (c==a)) {
            return "ISOSCELES";
        } else {
            return "SCALENE";
        }
    }

    public double calculateArea() {
        double hight;
        double p;
        p = (a + b + c)/2;
        hight = (float)(2*sqrt(p*(p-a)*(p-b)*(p-c))/a);
        return a*hight/2;

    }

    public double calculatePerimeter() {
        return ( a + b + c) ;
    }


}
