package fr.htc.tools.core;

import fr.htc.tools.types.Operation;

public class ToolsLuncher {
	private static String companyName = "UKNOWN COMPANY";

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		setCompanyName(args);
		int choice = -1;
		do {
			choice = printMenuAndCatchUserChoice();
			OperationSwitcher.switchTo(choice);
	
		} while (choice != 0 && pressAnyKeyToContinue());
		
		cleanUp();
	}

	/**
	 * 
	 * @param args
	 */
	private static void setCompanyName(String[] args) {
		if (args.length != 0) {
			companyName = args[0];
		}
	}

	/**
	 * 
	 * @return
	 */
	private static int printMenuAndCatchUserChoice() {
		System.out.println("\n******************** " + companyName + " *************************");
		System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques ‘’");
		System.out.println("");
		System.out.println("\t- Equation 2 Deg.                 \t\t\tTapez 1");
		System.out.println("\t- Factoriel                       \t\t\tTapez 2");
		System.out.println("\t- PGCD                            \t\t\tTapez 3");
		System.out.println("\t- Grande valeur d'un tableau      \t\t\tTapez 4");
		System.out.println("\t- Moyenne_ecart type              \t\t\tTapez 5");
		System.out.println("\t- List of Persons                 \t\t\tTapez 6");
		System.out.println("\t- Quitter                         \t\t\tTapez 0");
		System.out.print("\t\t\tFaites votre choix : ");

		int choice = Operation.scanner.nextInt();
		System.out.println("*****************************************************************");
		return choice;
	}

	/**
	 * 
	 */
	private static boolean pressAnyKeyToContinue() {
		System.out.println("Press Enter key to continue...");
		try {
			System.in.read();
			return true;
		} catch (Exception e) {
			System.out.println("error");
			return true;
		}
	}

	/**
	 * 
	 */
	private static void cleanUp() {
		Operation.scanner.close();
	}
}
