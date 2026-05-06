/*Question 17: Write a Java program to sort Book objects based on price.

Description: Create Book class with id, name and price. Store 5 books using constructor.
 Sort based on price using simple sorting logic.
INPUT:
1 Java 500
2 Python 450
3 C++ 600
4 SQL 300
5 HTML 250

OUTPUT:
Books sorted by price:
HTML 250
SQL 300
Python 450
Java 500
C++ 600*/


import java.util.*;

class Book {
    int id;
    String name;
    int price;

    // Constructor
    Book(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class SortingAPP {
    public static void main(String[] args) {

        // Creating Book objects
        Book b1 = new Book(1, "Java", 500);
        Book b2 = new Book(2, "Python", 450);
        Book b3 = new Book(3, "C++", 600);
        Book b4 = new Book(4, "SQL", 300);
        Book b5 = new Book(5, "HTML", 250);

        // Store objects in array
        Book books[] = {b1, b2, b3, b4, b5};

        // Sorting based on price
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {

                if (books[i].price > books[j].price) {

                    // Swap objects
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

        // Display sorted books
        System.out.println("Books sorted by price:");

        for (Book b : books) {
            System.out.println(b.name + " " + b.price);
        }
    }
}