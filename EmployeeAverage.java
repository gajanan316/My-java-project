/*Description: Create Employee class with id, name and salary. Calculate average salary then count employees having salary greater than average.
INPUT:
1 Ram 20000
2 Shyam 30000
3 Mohan 25000
4 Sita 35000

OUTPUT:
Average Salary: 27500
Employees above average: 2*/

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[4];

        // Input employee details
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        double total = 0;

        // Calculate total salary
        for (int i = 0; i < 4; i++) {
            total = total + emp[i].salary;
        }

        double avg = total / 4;

        int count = 0;

        // Count employees above average salary
        for (int i = 0; i < 4; i++) {
            if (emp[i].salary > avg) {
                count++;
            }
        }

        // Output
        System.out.println("Average Salary: " + avg);
        System.out.println("Employees above average: " + count);

        sc.close();
    }
}
