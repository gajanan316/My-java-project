/*Question 14: Write a Java program to create a Customer class and search a customer by id.

Description: Create Customer POJO class with id, name and city. Store multiple customers using constructor. Accept id from user and search customer.
INPUT:
Enter Customers:
1 Raj Pune
2 Amit Mumbai
3 Neha Nashik

Enter search Id: 2

OUTPUT:
Customer Found
Name: Amit
City: Mumbai*/


import java.util.*;

class Customer {
    int id;
    String name;
    String city;

    // Constructor
    Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}

class CustomerAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer[] cust = new Customer[3];

        // Input customers
        System.out.println("Enter Customers:");
        for (int i = 0; i < cust.length; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String city = sc.next();
            cust[i] = new Customer(id, name, city);
        }

        // Search ID
        System.out.print("Enter search Id: ");
        int searchId = sc.nextInt();

        boolean found = false;

        // Searching
        for (int i = 0; i < cust.length; i++) {
            if (cust[i].id == searchId) {
                System.out.println("Customer Found");
                System.out.println("Name: " + cust[i].name);
                System.out.println("City: " + cust[i].city);
                found = true;
                break;
            }
        }

        // If not found
        if (!found) {
            System.out.println("Customer Not Found");
        }

        sc.close();
    }
}