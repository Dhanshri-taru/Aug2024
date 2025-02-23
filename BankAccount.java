/*9. Simple Bank Account Menu
Description: Simulate a simple bank account with options to deposit, withdraw, check balance, and exit using a menu system. Use switch to manage the user's input and perform the corresponding operation.
Concepts Covered: switch, user input handling, basic financial operations.  */


import java.util.Scanner;
public class BankAccount 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        int choice;
        
        do {
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited successfully. Current balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfully. Current balance: " + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                
                case 4:
                    System.out.println("Exiting... Thank you for using our service!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }
}



/*C:\Program Files\Java\jdk-23\bin\second revision plan>javac BankAccount.java

C:\Program Files\Java\jdk-23\bin\second revision plan>java BankAccount

Bank Account Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 1
Enter deposit amount: 25000
Deposited successfully. Current balance: 25000.0

Bank Account Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 2
Enter withdrawal amount: 10000
Withdrawn successfully. Current balance: 15000.0

Bank Account Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 3
Current balance: 15000.0

Bank Account Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 4
Exiting... Thank you for using our service!
*/