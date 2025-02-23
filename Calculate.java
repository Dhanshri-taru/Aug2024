/*1. Simple Calculator
Description: Create a calculator program that takes two numbers and an operator (+, -, *, /) from the user. Use if-else or switch to perform the operation and display the result.
Concepts Covered: if-else, switch, basic arithmetic operations.   */


import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Perform operation using if-else
        double result;
        if (operator == '+') 
	{
            result = num1 + num2;
        } else if (operator == '-') 
	{
            result = num1 - num2;
        } else if (operator == '*') 
	{
            result = num1 * num2;
        } else if (operator == '/') 
	{
            if (num2 != 0) 
	    {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                return;
            }
        } else 
	{
            System.out.println("Error! Invalid operator.");
            return;
        }

        // Display result
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}



/*C:\Program Files\Java\jdk-23\bin\second revision plan>javac Calculator.java

C:\Program Files\Java\jdk-23\bin\second revision plan>java Calculator
Enter the first number: 22
Enter the operator (+, -, *, /): +
Enter the second number: 22
22.0 + 22.0 = 44.0   */