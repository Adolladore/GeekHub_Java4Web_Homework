package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Snickers extends Product {
    String name = "Snickers";
    double price = 1;

    public Snickers(int count) {
        super(count);
        super.name = name;
        super.price = price;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
