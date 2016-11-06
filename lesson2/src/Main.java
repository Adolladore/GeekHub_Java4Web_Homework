import figures.Circle;
import constants.FigureType;
import figures.Rectangle;
import figures.Square;
import figures.Triangle;

import java.util.Scanner;

/**
 * Created by Family on 29.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double radius;
        Scanner enterChoice = new Scanner(System.in);
        System.out.println("Choose figure: circle, square, rectangle, triangle");
        String figure = enterChoice.nextLine();
        figure = figure.toUpperCase();
        try {
            FigureType check = FigureType.valueOf(figure);

            switch (check){
                case CIRCLE:
                    System.out.println("Enter radius of Circle");
                    radius = enterChoice.nextDouble();
                    Circle circle1 = new Circle(radius);
                    circle1.action();
                    break;
                case SQUARE:
                    System.out.println("Enter side of square (a)");
                    a = enterChoice.nextDouble();
                    Square square1 = new Square(a);
                    square1.action();
                    break;
                case RECTANGLE:
                    System.out.println("Enter sides of rectangle (a and b)");
                    a = enterChoice.nextDouble();
                    b = enterChoice.nextDouble();
                    Rectangle rectangle1 = new Rectangle(a,b);
                    rectangle1.action();
                    break;
                case TRIANGLE:
                    System.out.println("Enter sides of triangle a, b and c");
                    a = enterChoice.nextFloat();
                    b = enterChoice.nextFloat();
                    c = enterChoice.nextFloat();
                    Triangle triangle1 = new Triangle(a,b,c);
                    triangle1.action();
                    break;
            }

        } catch(IllegalArgumentException e){
                 System.out.println("Wrong figure");
        }
    }
}
