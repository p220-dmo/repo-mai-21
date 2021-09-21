package fr.htc.java.oo.manip;

public class Utilisation {

	public static void main(String[] args) {
		
		
		
		
		Personne p2 = new Personne(1980);
		
		Personne p3 = new Personne("Pikatchou");
		
		Personne p4 = new Personne("Bulbizare", 1920);
		
		Personne p1 =  new Personne();
		
		System.out.println(p1);
		System.out.println(p1.nom);
		System.out.println(p1.anneeNaissance);
		System.out.println(p1.age());
		
		System.out.println("___________________________________");
		p1.nom = "MOUCHENE" ;
		p1.anneeNaissance = 1983;
		
		System.out.println(p1);
		System.out.println(p1.nom);
		System.out.println(p1.anneeNaissance);
		
		System.out.println(p1.age());

	}

}
