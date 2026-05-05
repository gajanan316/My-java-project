/*Question 16: Write a Java program to delete a student record from an array using constructor objects.

Description: Create Student class with rollNo, name and percentage. Store student objects. 
Accept roll number to delete and remove that record (shift array).
INPUT:
Students:
1 Ravi 70
2 Kiran 65
3 Om 80

Enter roll to delete: 2

OUTPUT:
Remaining Students:
1 Ravi 70
3 Om 80  */

import java.util.*;

class Student {
    int rollNo;
    String name;
    double percentage;

    // Constructor
    Student(int r, String n, double p) {
        rollNo = r;
        name = n;
        percentage = p;
    }
}

class StudentAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        // Input students
        System.out.println("Enter Students:");
        for (int i = 0; i < s.length; i++) {
            int r = sc.nextInt();
            String n = sc.next();
            double p = sc.nextDouble();
            s[i] = new Student(r, n, p);
        }

        // Delete roll number
        System.out.print("Enter roll to delete: ");
        int delRoll = sc.nextInt();

        int index = -1;

        // Find index of student to delete
        for (int i = 0; i < s.length; i++) {
            if (s[i].rollNo == delRoll) {
                index = i;
                break;
            }
        }

        // If found → shift elements
        if (index != -1) {
            for (int i = index; i < s.length - 1; i++) {
                s[i] = s[i + 1];
            }

            System.out.println("Remaining Students:");
            for (int i = 0; i < s.length - 1; i++) {
                System.out.println(s[i].rollNo + " " + s[i].name + " " + s[i].percentage);
            }
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}