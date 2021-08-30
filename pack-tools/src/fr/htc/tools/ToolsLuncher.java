package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {

	public static void main(String[] args) {
		
		//Affichage du menu
		 System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques‘’");
		 System.out.println("menu");
		 System.out.println("\t - Addition		tapez 1");
		 System.out.println("\t - Soustraction		tapez 2");
		 System.out.println("\t - Multiplication	tapez 3");
		 System.out.println("\t - Division		tapez 4");
		 System.out.println("\t - Equation 2 Deg	tapez 5");
		 System.out.println("\t - quitter		tapez 0");
		
		//Demander à l'utilisateur d'introduire son choix
		 
		Scanner scanner = new Scanner(System.in);
		int a,b,choix ;
		
		System.out.println("faites votre choix");
		choix = scanner.nextInt();
		
		
		
	      switch ( choix ) {
	      case 1:
	    	  System.out.println("Addition...1");
	    	  break;
	    	  
	    	  
	  
	      case 2 :  
	    	  System.out.println("soustaction");
	    	 break;
	      case 3:   
	    	  System.out.println("multiplication "); 
		     break; 
	      case 4:
	    	  System.out.println( "division");
		    	break; 
	      case 5:
	    	  System.out.println( "equation 2 degre");
		    		   break;
	      case 6:
	    	  System.out.println("quitter" );
		    		break;	   
	      
	      }		
	System.out.println(choix);
	
	}
}

	
