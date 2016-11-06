package figures;

/**
 * Created by Family on 28.10.2016.
 */
public class Rectangle extends Square {
    String figure = "Rectangle";

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        super.b = sideB;
    }

    public void action() {
        super.figure = figure;

        super.action();
    }
}
