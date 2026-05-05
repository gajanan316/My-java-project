/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile class and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. Create overloaded constructors (one without discount, one with discount). If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000*/

class Mobile {
    int mobileId;
    String mobileName;
    double price;

    // Constructor WITHOUT discount
    public Mobile(int id, String name, double p) {
        mobileId = id;
        mobileName = name;
        price = p;
        System.out.println("Original Price: " + price);
    }

    // Constructor WITH discount (10%)
    public Mobile(int id, String name, double p, boolean discount) {
        mobileId = id;
        mobileName = name;
        price = p;

        double discountPrice = price - (price * 0.10);

        System.out.println("Original Price: " + price);
        System.out.println("Discount Price: " + discountPrice);
    }

    public static void main(String[] args) {

        // Using discount constructor
        Mobile obj = new Mobile(101, "Samsung", 20000, true);
    }
}