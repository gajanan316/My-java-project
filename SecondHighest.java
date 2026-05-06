
/*Question 19: Write a Java program to find second highest number from Number objects.

Description: Create Number class with value field. Store numbers using constructor and find second maximum value.
INPUT:
10 40 25 90 60

OUTPUT:
Second Highest Number: 60

*/
import java.util.Scanner;

class Number {
    int value;

    // Constructor
    Number(int value) {
        this.value = value;
    }
}

public class SecondHighest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Number[] num = new Number[5];

        // Input numbers
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            num[i] = new Number(n);
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Find highest and second highest
        for (int i = 0; i < 5; i++) {

            if (num[i].value > highest) {
                secondHighest = highest;
                highest = num[i].value;
            }
            else if (num[i].value > secondHighest && num[i].value != highest) {
                secondHighest = num[i].value;
            }
        }

        // Output
        System.out.println("Second Highest Number: " + secondHighest);

        sc.close();
    }
}