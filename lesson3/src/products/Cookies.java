package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Cookies extends Product{
    String name = "Cookies";
    double price = 3;

    public Cookies(int count) {
        super(count);
        super.name = name;
        super.price = price;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
