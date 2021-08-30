package fr.htc.tools;

import java.io.InputStream;
import java.util.Scanner;

public class ToolsLuncher {

	public static void main(String[] args) {

		// Affichage du menu

		System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques ‘’ ");
		System.out.println("        - Addition                  Tapez 1");
		System.out.println("        - Soustraction              Tapez 2");
		System.out.println("        - Multiplication            Tapez 3");
		System.out.println("        - Division                  Tapez 4");
		System.out.println("        - Equation 2 Deg.           Tapez 5");
		System.out.println("        - Factoriel                 Tapez 6");
		System.out.println("        - Quitter                   Tapez 0");
		// Demander à l'utilisateur d'introduire son choix

		Scanner scanner = new Scanner(System.in);

		int choix, a, b, c;
		int n, result, i, j, m;
		
		while(choix) {
		System.out.println("Faite votre choix : ");
		choix = scanner.nextInt();
		}
		// Switch en fonction du choix

		switch (choix) {

		case 1:
			System.out.println("Entrez la valeur de a : ");
			a = scanner.nextInt();

			System.out.println("entrez la valeur de b:");
			b = scanner.nextInt();
			System.out.println("la somme est : " + (a + b));
			break;
	
		case 2:
			System.out.println("Entrez la valeur de a : ");
			a = scanner.nextInt();

			System.out.println("entrez la valeur de b:");
			b = scanner.nextInt();
			System.out.println("La différence est :" + (a - b));
			break;

		case 3:
			System.out.println("Entrez la valeur de a : ");
			a = scanner.nextInt();

			System.out.println("entrez la valeur de b:");
			b = scanner.nextInt();
			System.out.println("le produit est :" + (a * b));
			break;

		case 4:
			System.out.println("Entrez la valeur de a : ");
			a = scanner.nextInt();

			System.out.println("entrez la valeur de b:");
			b = scanner.nextInt();
			System.out.println("la division est : " + (a / b));
			break;

		case 5:
			System.out.println("Entrez la valeur de a : ");
			a = scanner.nextInt();

			System.out.println("entrez la valeur de b:");
			b = scanner.nextInt();
			System.out.println("Entrez la valeur de c: ");
			c = scanner.nextInt();
			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.err.println("No solution");
				System.exit(-1);
			}
			if (delta == 0) {
				System.err.println("->" + -b / (2 * a));
				System.exit(-1);
			}

			if (delta > 0) {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.err.println("1-> " + x1);
				System.err.println("2-> " + x2);
				System.exit(-1);
			}
			break;
	
		case 6:
			System.out.println("Entrez une valeur pour n");
			n = scanner.nextInt();
			result = 1;
			i = n;

			while (i > 1) {
				result = result * i;
				i--;
			}

			System.out.println("La factorielle de n " + n + " vaut :" + result);

			break;
			
		case 0:
			
			System.out.println (" Vous avez choisi de sortir...Bye!!! \n");
            break;

		}
		System.out.println(choix);
	}
}
