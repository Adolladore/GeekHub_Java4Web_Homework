package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Bread extends Product {
    private String name = "Bread";
    private double price = 1.5;
    public int count;


    public Bread(int count) {
        super(count);
        super.name = name;
        super.price = price;
    }

   @Override
    public boolean checkQuantity() {
        super.count = count;
        return super.checkQuantity();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
