package fr.htc.java.oo.geo;

public class UtilisationGeo {

	public static void main(String[] args) {

		Circle c; // c est une r�f�rence sur un objet de type Circle, pas encore un objet
		
		c = new Circle(5.0); // c r�f�rence maintenant un objet allou� en  m�moire
		
		c.x = c.y = 10; // ces valeurs sont stock�es dans le corps de l�objet
		
		
		System.out.println("Aire de c :" + c.area());
	}
}
