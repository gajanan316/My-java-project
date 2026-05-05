/*Question 15: Write a Java program to create a Product inventory and update product price.

Description: Create Product class with id, name and price. Store products using constructor. Accept product id and new price and update it.
INPUT:
Products:
1 Mouse 500
2 Keyboard 800
3 Monitor 9000

Enter Product Id to update: 2
Enter new price: 1000

OUTPUT:
Updated Product:
Keyboard Price: 1000
*/
import java.util.*;

class Product {
    int id;
    String name;
    double price;

    // Constructor
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ProductPriceAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] p = new Product[3];

        // Input products
        System.out.println("Enter Products:");
        for (int i = 0; i < p.length; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            p[i] = new Product(id, name, price);
        }

        // Take id to update
        System.out.print("Enter Product Id to update: ");
        int searchId = sc.nextInt();

        System.out.print("Enter new price: ");
        double newPrice = sc.nextDouble();

        boolean found = false;

        // Search and update
        for (int i = 0; i < p.length; i++) {
            if (p[i].id == searchId) {
                p[i].price = newPrice;

                System.out.println("Updated Product:");
                System.out.println(p[i].name + " Price: " + p[i].price);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}