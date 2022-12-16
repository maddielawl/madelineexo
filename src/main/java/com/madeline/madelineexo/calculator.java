package com.madeline.madelineexo;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        // Print a welcome message
        System.out.println("Bienvenue sur la calculette");

        // Loop until the user chooses to exit
        while (true) {
            // Get the first number from the user
            System.out.print("Entrez un numéro ");
            num1 = scanner.nextDouble();

            // Get the operator from the user
            System.out.print("Entrez le signe de calcul (+, -, *, /, ou Q pour quitter): ");
            operator = scanner.next();

            // If the user wants to exit, break out of the loop
            if (operator.equalsIgnoreCase("Q")) {
                break;
            }

            // Get the second number from the user
            System.out.print("Entrez un second numero ");
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
                    System.out.println("Signe invalide");
                    break;
            }

            // Print the result
            System.out.println("Resultat: " + result);

            // Ask the user if they want to clear the calculation
            System.out.print("Recommencer ? (Y/N)? ");
            if (scanner.next().equalsIgnoreCase("Y")) {
                // Clear the result and start the loop over
                result = 0;
                continue;
            }
            else{
                // Print a goodbye message
                System.out.println("Merci d'avoir utiliser la calculette");
                main menu = new main();
                menu.main(args);
            }
        }



    }

}
