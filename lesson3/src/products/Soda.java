package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Soda extends Product{
    String name = "Soda";
    double price = 1.5;

    public Soda(int count) {
        super(count);
        super.name = name;
        super.price = price;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
