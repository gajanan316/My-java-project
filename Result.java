/*Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor. Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80*/


class Result {
    int m1, m2, m3;
    double avg;

    // Constructor
    public Result(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    // Method to calculate and display average
    void calculateAverage() {
        avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        Result obj = new Result(70, 80, 90);
        obj.calculateAverage();
    }
}