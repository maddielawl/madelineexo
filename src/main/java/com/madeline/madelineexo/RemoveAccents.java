package com.madeline.madelineexo;
import java.util.Scanner;
import java.text.Normalizer;

public class RemoveAccents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Print a prompt to the user
        System.out.print("Entrez une phrase avec des accents: ");
        input = scanner.nextLine();

        // Remove the accents
        String unaccented = Normalizer.normalize(input, Normalizer.Form.NFD);
        unaccented = unaccented.replaceAll("[^\\p{ASCII}]", "");

        // Print the unaccented string
        System.out.println("Phrase sans accents: " + unaccented);
    }

}
