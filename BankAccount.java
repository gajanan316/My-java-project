/*Question 10: Write a Java program to create a BankAccount class and check minimum balance condition.

Description: Create BankAccount class with accountNumber, customerName and balance. Initialize using constructor. If balance < 1000 display Minimum Balance Warning otherwise Valid Balance.
INPUT:
Enter Account Number: 12345
Enter Customer Name: Suresh
Enter Balance: 800

OUTPUT:
Customer Name: Suresh
Status: Minimum Balance Warning*/

class BankAccount {
    int accountNumber;
    String customerName;
    double balance;

    // Constructor
    public BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        customerName = name;
        balance = bal;
    }

    // Method to check balance status
    void checkBalance() {
        System.out.println("Customer Name: " + customerName);

        if (balance < 1000) {
            System.out.println("Status: Minimum Balance Warning");
        } else {
            System.out.println("Status: Valid Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount(12345, "Suresh", 800);
        obj.checkBalance();
    }
}