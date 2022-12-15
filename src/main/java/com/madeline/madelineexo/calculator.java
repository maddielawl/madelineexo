package com.madeline.madelineexo;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        // Print a welcome message
        System.out.println("Welcome to the Calculator program!");

        // Loop until the user chooses to exit
        while (true) {
            // Get the first number from the user
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            // Get the operator from the user
            System.out.print("Enter the operator (+, -, *, /, or Q to quit): ");
            operator = scanner.next();

            // If the user wants to exit, break out of the loop
            if (operator.equalsIgnoreCase("Q")) {
                break;
            }

            // Get the second number from the user
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Perform the calculation
            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            // Print the result
            System.out.println("Result: " + result);

            // Ask the user if they want to clear the calculation
            System.out.print("Clear calculation (Y/N)? ");
            if (scanner.next().equalsIgnoreCase("Y")) {
                // Clear the result and start the loop over
                result = 0;
                continue;
            }
        }

        // Print a goodbye message
        System.out.println("Goodbye! Thank you for using the Calculator program.");
    }

}
