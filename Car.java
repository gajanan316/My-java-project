/*Question 8: Write a Java program to create a Car class and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. Initialize values using constructor and display car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000*/

class Car {
    int carId;
    String carName;
    double price;

    // Constructor
    public Car(int id, String name, double p) {
        carId = id;
        carName = name;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println("Car Details:");
        System.out.println("Id: " + carId);
        System.out.println("Name: " + carName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car obj = new Car(301, "Swift", 650000);
        obj.display();
    }
}