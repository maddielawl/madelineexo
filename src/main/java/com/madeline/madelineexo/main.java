package com.madeline.madelineexo;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Merci de choisir une classe à utiliser");
		System.out.println("1. Calculette, pour calculer");
		System.out.println("2. Enlever des accents");
		System.out.println("3. Générateur de classes aléatoire, jeu vide1o");
		System.out.println("4. Répéter le nom : Simon");

		int choice = sc.nextInt();

		switch (choice) {
			case 1:
				calculator calc = new calculator();
				calc.main(args);
				break;
			case 2:
				RemoveAccents ra = new RemoveAccents();
				ra.main(args);
				break;
			case 3:
				SelectClass classe = new SelectClass();
				classe.chooseAClass();
				break;
			case 4:
				stringrepeat repeat = new stringrepeat();
				repeat.repeat("Simon :)");
				break;
			default:
				System.out.println("Choix Invalide, merci de réssayer");
				//main(String[] args);
				break;
		}
	}

	}


