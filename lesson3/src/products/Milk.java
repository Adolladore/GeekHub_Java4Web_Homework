package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Milk extends Product {
    String name = "Milk";
    double price = 2.5;

    public Milk(int count) {
        super(count);
        super.name = name;
        super.price = price;
    }

    @Override
    public boolean checkQuantity() {
        return super.checkQuantity();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
