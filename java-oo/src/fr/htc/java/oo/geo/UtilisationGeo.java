package fr.htc.java.oo.geo;

public class UtilisationGeo {

	public static void main(String[] args) {

		Circle c; // c est une référence sur un objet de type Circle, pas encore un objet
		
		c = new Circle(5.0); // c référence maintenant un objet alloué en  mémoire
		
		c.x = c.y = 10; // ces valeurs sont stockées dans le corps de l’objet
		
		
		System.out.println("Aire de c :" + c.area());
	}
}
