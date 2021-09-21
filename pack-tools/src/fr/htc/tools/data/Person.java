package fr.htc.tools.data;

public class Person {
	private String nom;
	private String prenom;
	private int age;

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
