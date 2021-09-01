package fr.htc.tools.types;

public class PGCD implements Operation {

	@Override
	public void process(String title) {
		System.out.println("Je suis dans le choix : " + title);
	
		int n1,n2,pgdc = 0;
	       System.out.print("Entrez le premier nombre : ");
	       n1 = scanner.nextInt();
	       System.out.print("Entrez le deuxième nombre : ");
	       n2 = scanner.nextInt();
	       
	       for(int i=1; i <=n1 && i <= n2; i++) {
	    	   
	    	   if(n1% i==0 && n2%i==0)
	    		   pgdc = i;
	       }
	      
	       System.out.printf("Le PGCD de %d et %d est: %d", n1, n2, pgdc);
	
	}

}
