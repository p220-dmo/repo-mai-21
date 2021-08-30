package fr.htc.tools;

import java.util.Scanner;

public class ToolsLuncher {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Affichage du menu
		
		System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques ‘’");
		
	
		System.out.println("");
		System.out.println("");
		System.out.println("\t-Addition                Tapez 1");
		System.out.println("\t-Soustraction            Tapez 2");
		System.out.println("\t-Multiplication          Tapez 3");
		System.out.println("\t-Division                Tapez 4");
		System.out.println("\t-Equation 2 Deg.         Tapez 5");
		System.out.println("\t-Factoriel               Tapez 6");
		System.out.println("");
		System.out.println("\t-Quitter                 Tapez 0");
		System.out.println("");
		
		
		//Demander à l'utilisateur d'introduire son choix
		
		
		int choix = 1;
		System.out.println("Faite votre choix :");
		
		
		choix = input.nextInt();
		
		
		//Switch en fonction du choix
		switch (choix) {
		case 1:
			int num1, num2, sum;
	        Scanner Scanner = new Scanner(System.in);
	        System.out.println("Enter le premier nombre: ");
	        num1 = input.nextInt();
	        
	        System.out.println("Enter le deuxieme nombre: ");
	        num2 = input.nextInt();
	        
	        input.close();
	        sum = num1 + num2;
	        System.out.println("le resultat de l'addition est : "+sum);
			
			break;

		case 2:
			int dif1, dif2, dif;
			Scanner input1 = new Scanner(System.in);
	        System.out.println("Enter le premier nombre: ");
	        dif1 = input1.nextInt();
	        
	        System.out.println("Enter le deuxieme nombre: ");
	        dif2 = input1.nextInt();
	        
	        input1.close();
	        dif = dif1 - dif2;
	        System.out.println("le resultat de l'addition est : "+dif);
			
			break;
			
		case 3:
			int mul1, mul2, mul;
			Scanner input2 = new Scanner(System.in);
	        System.out.println("Enter le premier nombre: ");
	        mul1 = input2.nextInt();
	        
	        System.out.println("Enter le deuxieme nombre: ");
	        mul2 = input2.nextInt();
	        
	        input2.close();
	        mul = mul1 * mul2;
	        System.out.println("le resultat de l'addition est : "+mul);
			
			break;
			
			
		case 4:
			int div1, div2, div;
			Scanner input3 = new Scanner(System.in);
	        System.out.println("Enter le premier nombre: ");
	        div1 = input3.nextInt();
	        
	        System.out.println("Enter le deuxieme nombre: ");
	        while ((div2 = input3.nextInt()) != 0);
	        
	        input3.close();
	        div = div1 / div2;
	        System.out.println("le resultat de l'addition est : "+div);
			
			break;
		
		//Traiter chaque cas



		case 5:

	
		        double a = 0.0;
		        double b = 0.0;
		        double c = 0.0;

		      
		        while (a == 0.0) {
		            System.out.print("Entrez une valeur non nulle pour a :");
		            a = input.nextDouble();
		        }
		        
		        System.out.print("Entrez une valeur pour b:");
		        b = input.nextDouble();
		        System.out.print("Entrez une valeur pour c:");
		        c = input.nextDouble();
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
		        
		case 6:
		    }
		}

}