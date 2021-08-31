package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {
	public static final byte ADDITION = 1;
	public static final byte SOUSTRACTION = 2;
	public static final byte MULTIPLICATION = 3;
	public static final byte DIVISION = 4;
	public static final byte EQUATION_SECOND_DEGRE = 5;
	public static final byte FACTORIELLE = 6;

	public static final byte EXIT_APP = 0;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		byte choice = -1;
		double a=0,b=0,c=0;
		int i,result,n;
		do {
			choice = printMenuAndGetUserChoice();

			switch (choice) {
			case ADDITION:
				System.out.println("saisir la valeur de a :" );
				a = scanner.nextInt();
				
				System.out.println("saisir la valeur de b :" );
				b=scanner.nextInt();
				
				System.out.println("l'addition est : "+(a+b));
				
				break;
			case SOUSTRACTION:
				System.out.println("saisir la valeur de a :" );
				a = scanner.nextInt();
				
				System.out.println("saisir la valeur de b :" );
				b=scanner.nextInt();
				System.out.println("la SOUSTRACTION est :"+(a-b));
				break;
				
			case MULTIPLICATION:
				System.out.println("saisir la valeur de a :" );
				a = scanner.nextInt();
				
				System.out.println("saisir la valeur de b :" );
				b=scanner.nextInt();
				System.out.println("la MULTIPLICATION de a et b est :" +(a*b));
				break;
				
			case DIVISION:
				System.out.println("saisir la valeur de a :" );
				a = scanner.nextInt();
				
				System.out.println("saisir la valeur de b :" );
				b=scanner.nextInt();
				System.out.println("la DIVISION de a et b est : "+(a/b));
				break;
			
			case EQUATION_SECOND_DEGRE : 
				 while (a == 0.0) {
			            System.out.print("Entrez une valeur non nulle pour a:");
			            a = scanner.nextDouble();
			        }
			        
			        System.out.print("Entrez une valeur pour b:");
			        b = scanner.nextDouble();
			        System.out.print("Entrez une valeur pour c:");
			        c = scanner.nextDouble();
			        double delta = b * b - 4.0 * a * c;
			        if (delta < 0.0) {
			            System.out.println("Pas de solutions reelles");
			        } else if (delta > 0.0) {
			            System.out.println("Deux solutions : "
			                        + (-b - Math.sqrt(delta)) / (2.0 * a)
			                        + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
			            
			        } else {
			            System.out.println("Une solution unique : " + -b / (2.0 * a));
			            
			        }
			        break;
			        
			case FACTORIELLE:
				
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
	 * 
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
	}
}
