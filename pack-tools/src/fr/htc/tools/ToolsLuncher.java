package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {

	public static void main(String[] args) {
		
		//Affichage du menu
		System.out.println("Bien venue à l'aplication : Operation Mathématique");
		System.out.println("\t-Adition          tapez 1 ");
		System.out.println("\t-Soustraction     tapez 2 ");
		System.out.println("\t-Multiplication   tapez 3 ");
		System.out.println("\t-Division         tapez 4 ");
		System.out.println("\t-Equation 2Deg    tapez 5 ");
		System.out.println("\t-Factoriel        tapez 6 ");
		System.out.println("\t-Quitter          tapez 0 ");
		
		
		//Demander à l'utilisateur d'introduire son choix
		
		
        byte choix;
		Scanner Scanner = new Scanner (System.in);
		System.out.println("entrer votre choix");
		choix = Scanner.nextByte();
		switch (choix) {
        case 1:  System.out.println("Adition");
                 break;
        case 2: System.out.println("Soustraction") ;
                 break;
        case 3:  System.out.println("Multiplication");
                 break;
        case 4:  System.out.println("Division");
                 break;
        case 5:  System.out.println("Equation 2 Deg");
                 break;
        case 6:  System.out.println("Factoriel");
                 break;
        case 0:  System.out.println("au revoir");
                 break;
        default: System.out.println("Ce choix n'est pas inclus");
                 break;
    }
		
		//Switch en fonction du choix1
		 int a,b,c;
		 Scanner Scanner1 = new Scanner (System.in);
		 a = Scanner1.nextInt();
		 b = Scanner1.nextInt();
		 c = a + b;
		 
		 System.out.println("l'Adition est c = " +c);
			
	
		//Traiter chaque cas

	}

}
