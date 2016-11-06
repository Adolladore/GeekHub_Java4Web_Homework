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

    public double getTotalPrice(){
        return count*price;
    }
}
