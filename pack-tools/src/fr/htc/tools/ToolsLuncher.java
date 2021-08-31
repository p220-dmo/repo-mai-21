package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {
	public static final byte ADDITION = 1;
	public static final byte SOUSTRACTION = 2;
	public static final byte MULTIPLICATION = 3;
	public static final byte DIVISION = 4;
	public static final byte EQUATION_SECOND_DEGRE = 5;
	public static final byte FACTORIEL = 6;
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
				int a,b,sum;
				Scanner Scanner = new Scanner (System.in);
				System.out.println("entrer le premier nombre a =");
				a = scanner.nextInt();
				System.out.println("entrer le deuxieme nombre b =");
				b = scanner.nextInt();
				sum = a + b; 
				System.out.println("le resultat de l'ADDITION est :" + sum);
				
				break;
			case SOUSTRACTION:
				System.out.println("Vous avez choisi SOUSTRACTION ");
				int c,d,sous;
				Scanner Scanner1 = new Scanner (System.in);
				System.out.println("entrer le premier nombre c =");
				c = scanner.nextInt();
				System.out.println("entrer le deuxieme nombre d =");
				d = scanner.nextInt();
				sous = c - d;
				System.out.println("le resultat de la SOUSTRACTION est :" + sous);
				
				break;
			case MULTIPLICATION:
				System.out.println("Vous avez choisi MULTIPLICATION ");
				int e,f,mul;
				Scanner Scanner2 = new Scanner (System.in);
				System.out.println("entrer le premier nombre e =");
				e = scanner.nextInt();
				System.out.println("entrer le deuxieme nombre f =");
				f = scanner.nextInt();
				mul = e * f;
				System.out.println("le resultat de la MULTIPLICATION est :" + mul);
				break;
			case DIVISION:
				System.out.println("Vous avez choisi DIVISION ");
				int n,m = 0,div;
				Scanner Scanner3 = new Scanner (System.in);
				System.out.println("entrer le nominateur n =");
				n = scanner.nextInt();
				while (m==0) {
				System.out.println("entrer le dinominateur (doit etre different de 0) m =");
				m = scanner.nextInt();
				}
				div = n / m;
				System.out.println("le resultat de la DIVISION est :" + div);
				break;
				
			case EXIT_APP:
				System.out.println("Vous avez choisi EXIT_APP ");
				System.out.println("Au revoir");
				break;
			case EQUATION_SECOND_DEGRE:
				System.out.println("Vous avez choisi EQUATION_SECOND_DEGRE ");
				double A, B, C, delta, x1, x2;
				Scanner Scanner4 = new Scanner (System.in);
				System.out.println("entrer la valeur de A = ");
				A = scanner.nextDouble();
				System.out.println("entrer la valeur de B = ");
				B = scanner.nextDouble();
				System.out.println("entrer la valeur de c = ");
				C = scanner.nextDouble();
				delta = B * B - 4.0 * A * C;
				System.out.println("la valeur de delta est : " +delta);
				 if (delta < 0.0) {
			          System.out.println("Pas de solutions reelles");
			      } 
				 else if (delta > 0.0) {
			          System.out.println("Deux solutions : "
			                      + (-B - Math.sqrt(delta)) / (2.0 * A)
			                      + " et " + (-B+ Math.sqrt(delta)) / (2.0 * A));
			      } 
			      else {
			          System.out.println("Une solution unique : " + -B / (2.0 * A));
			      }
							
				break;
				
			case FACTORIEL:
				System.out.println("Vous avez choisi FACTORIEL ");
				Scanner scanner = new Scanner(System.in);

	            int x, result, i;
	           
	            System.out.println("Entrez une valeur pour x");
	            x = scanner.nextInt();

	            result = 1;
	            i = x;

	            while (i > 1) {
	                    result = result * i;
	                    i--;
	            }

	            System.out.println("La factorielle de x = " + x + " vaut :" + result);

	            
	           
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
	}

}
