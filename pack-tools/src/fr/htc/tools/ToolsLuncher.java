package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {

	public static void main(String[] args) {

		// Affichage du menu

		System.out.println("bienvenue à l'application : opérations mathématiques");
		System.out.println("\t - Addition:\t\t Tapez 1");
		System.out.println("\t - Soustraction:\t Tapez 2");
		System.out.println("\t - Multiplication:\t Tapez 3");
		System.out.println("\t - Division:\t\t Tapez 4");
		System.out.println("\t - Equation, 2 deg:\t Tapez 5");
		System.out.println("\t - Factoriel:\t\t Tapez 6");
		System.out.println("\t - Quitter:\t\t Tapez 0");

		// Demander à l'utilisateur d'introduire son choix

		Scanner scanner = new Scanner(System.in);
		int choix, a, b, c;
		System.out.println("faite votre choix :");
		choix = scanner.nextInt();
		System.out.println("entrer la valeur de a");
		a = scanner.nextInt();
		System.out.println("entrer la valeur de b");
		b = scanner.nextInt();
		System.out.println("entrer la valeur de c");
		c = scanner.nextInt();
		System.out.println("resulat");

		// Switch en fonction du choix
		switch (choix) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("0");
			break;
		// outputs "afficher l'operation"
		// Traiter chaque cas

		}
	}
}
