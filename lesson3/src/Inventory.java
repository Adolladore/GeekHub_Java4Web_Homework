import products.*;

import java.util.*;

/**
 * Created by danil on 05.11.2016.
 */
public class Inventory {

    public static void main(String[] args) {
        Map<String, Product> inventory = new HashMap<>();
        Scanner getValue = new Scanner(System.in);
        System.out.println("Choose a product you want to add in your inventory");
        System.out.println("1.Bread\n2.Cookies\n3.Flakes\n4.Milk\n5.Snickers\n6.Soda\n0.Exit");
        int choice;
        int numberOfProduct;
        do {
            choice = getValue.nextInt();
            if (choice == 0) {
                continue;
            } else {
                System.out.println("Enter quantity of the product (Coockies in kg)");
                numberOfProduct = getValue.nextInt();
            }

            switch (choice) {
                case 1:
                    inventory.put("Bread", new Bread(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " loaves");
                    break;
                case 2:
                    inventory.put("Coockies", new Cookies(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " kg of coockies");
                    break;
                case 3:
                    inventory.put("Flakes", new Flakes(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " packs of flakes");
                    break;
                case 4:
                    inventory.put("Milk", new Milk(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " packs of milk");
                    break;
                case 5:
                    inventory.put("Snickers", new Bread(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " snickers");
                    break;
                case 6:
                    inventory.put("Soda", new Bread(numberOfProduct));
                    System.out.println("It added "+ numberOfProduct+ " cans of soda");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        } while (choice != 0);

        System.out.println("Choose an action:");
        System.out.println("1.Check Status\n2.The sum of all products\n0.Exit");
        int summ = 0;
        do {
            choice = getValue.nextInt();
            switch (choice) {
                case 1:
                    for (String product : inventory.keySet()) {
                        System.out.println(product + ": count =  " + inventory.get(product).count + " price =  "
                                + inventory.get(product).price + " total price = "
                                + inventory.get(product).getTotalPrice());
                    }
                    break;
                case 2:
                    for (String product : inventory.keySet()) {
                       summ += inventory.get(product).getTotalPrice();
                    }
                    System.out.println("The sum of all products = " + summ + "$");
                    summ = 0;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        } while (choice != 0);



    }

}
