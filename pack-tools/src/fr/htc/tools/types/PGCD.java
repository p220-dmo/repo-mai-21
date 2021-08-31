package fr.htc.tools.types;

public class PGCD implements Operation {

	@Override
	public void process(String title) {
		System.out.println("Je suis dans le choix : " + title);
		System.out.print("Entrer le premier nombre : "); 
		int n1 = scanner.nextInt();
		System.out.print("Entrer le deuxieme nombre : ");
		int n2 = scanner.nextInt();
		int PGCD = 0;
		while (n1 != n2) {
	          if(n1 > n2)
	                n1 = n1 - n2;
	            else
	                n2 = n2 - n1;
	         	          
	        }
		System.out.printf("PGCD = %d", n2);
	}

}
