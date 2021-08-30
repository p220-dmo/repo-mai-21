package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {
	public static final byte ADDITION = 1;
	public static final byte SOUSTRACTION = 2;
	public static final byte MULTIPLICATION = 3;
	public static final byte DIVISION = 4;
	public static final byte EQUATION_SECOND_DEGRE = 5;
	public static final byte EXIT_APP = 0;
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		byte choice = -1;
		do {
			choice = printMenuAndGetUserChoice();

			switch (choice) {
			case ADDITION:
				System.out.println("Vous avez choisi ADDITION ");
				break;
			case SOUSTRACTION:
				System.out.println("Vous avez choisi SOUSTRACTION ");
				break;
			case MULTIPLICATION:
				System.out.println("Vous avez choisi MULTIPLICATION ");
				break;
			case DIVISION:
				System.out.println("Vous avez choisi DIVISION ");
				break;
			case EXIT_APP:
				System.out.println("Vous avez choisi EXIT_APP ");
				System.out.println("Au revoir");
				break;

			default:
				System.out.println("Choix inconnu !!!");
				break;

			}
			if (choice != 0) {
				pause();
			}
		} while (choice != EXIT_APP);

	}

	/**
	 * This method will print the menu and return the choice entred by user
	 * @return choice
	 */
	private static byte printMenuAndGetUserChoice() {
		System.out.println("***********************************************************");
		System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques ‘’");
		System.out.println(" ");
		System.out.println("       - Addition         Tapez 1");
		System.out.println("       - Soustraction     Tapez 2");
		System.out.println("       - Multiplication   Tapez 3");
		System.out.println("       - Division         Tapez 4");
		System.out.println("       - Equation 2 Deg.  Tapez 5");
		System.out.println("       - Factoriel        Tapez 6");
		System.out.println("       - Quitter          Tapez 0");
		System.out.print("Faite votre choix :");
		byte input = scanner.nextByte();
		return input;
	}

	/**
	 * this methode will make pause to see the result of previews operation
	 */
	private static void pause() {
		System.out.println("Press 0 and  Enter to continue.....");
		scanner.nextInt();
	
		
		byte choice = printMenuAndGetUserChoice();
	switch (choice) {
	
	case ADDITION:
	
		//Déclaration des variables
		int a, b, c, Somme, Soustraction, Multiplication, Division, Factoriel; 
		//Enregistrer les valeurs
		Scanner Scanner = new Scanner(System.in);
		System.out.println("entrer a:");
		System.out.println("entrer b");
		a = scanner.nextInt();
		b = scanner.nextInt();
		//calcul de l'addition
		Somme = a+b;
		//Afficher le résultat
		System.out.println("le résultat de l'Addition est" + Somme);
	break;
	
	case SOUSTRACTION: 
		Scanner scanner2= new Scanner(System.in);
		System.out.println("entrer a:");
		System.out.println("entrer b");
		a = scanner2.nextInt();
		b = scanner2.nextInt();
		//calcul soustraction
		Soustraction = a-b;
		//affichage 
		System.out.println("le résultat de la Soustraction est" + Soustraction);
		
		break;
	
	case MULTIPLICATION:
		Scanner scanner3= new Scanner(System.in);
		System.out.println("entrer a:");
		System.out.println("entrer b");
		a = scanner3.nextInt();
		b = scanner3.nextInt();
		//calcul
		Multiplication = a*b;
		//affichage 
		System.out.println("le résultat de la Multiplication est" + Multiplication);
		
		break;
		
	case DIVISION: 
		Scanner scanner4= new Scanner(System.in); 
		System.out.println("entrer a:");
		System.out.println("entrer b");
		a = scanner4.nextInt();
		b= scanner4.nextInt();
		// calcul
		Division = a/b;
		//affichage
		System.out.println("le résultat de la division est " + Division);
		
		break;
		
		
				
				
		
		
		

		
	}
	}
}
