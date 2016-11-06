package products;

/**
 * Created by danil on 05.11.2016.
 */
public class Product{
    public String name;
    public double price;
    public int count;

     public Product(int count){
         this.count = count;
     }

    public boolean checkQuantity() {
        if ( count < 0) {
            System.out.println("The number cannot be negative");
            return false;
        } else {
            return true;
        }
    }

    public double getTotalPrice(){
        return count*price;
    }
}
