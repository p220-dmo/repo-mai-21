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
		System.out.println("Bienvenue � l�application : �� Op�rations Math�matiques ��");
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
	}

}
