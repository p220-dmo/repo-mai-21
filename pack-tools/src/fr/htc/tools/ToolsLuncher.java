package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {

	public static void main(String[] args) {
		
		//Affichage du menu
		System.out.println( " bienvennue à l'application : Opérations Mathématiques" );
		System.out.println("\t - Addition ,          	tapez 1");
	    System.out.println("\t - Soustraction ,     	tapez 2");
		System.out.println("\t - Multiplication ,    	tapez 3");
		System.out.println("\t - tDivision ,         	tapez 4");
		System.out.println("\t - Equation 2 deg ,    	tapez 5");
		System.out.println("\t - Factoriel ,         	tapez 6");
		System.out.println("\t - quiter ,            	tapez 0");
		
		
		//Demander à l'utilisateur d'introduire son choix
		int  choix;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" faire votre choix" );
		choix  = scanner.nextInt();
			
				
		//Switch en fonction du choix
		
		switch(choix){
		   
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
	   }
    
}
		
		
		//Traiter chaque cas

	}


