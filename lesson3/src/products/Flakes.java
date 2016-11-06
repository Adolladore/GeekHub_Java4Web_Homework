package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Flakes extends  Product {
    String name = "Flakes";
    double price = 2;

    public Flakes(int count) {
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
