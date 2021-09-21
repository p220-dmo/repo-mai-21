package fr.htc.java.oo.manip;

public class Personne {
	
	public String nom;
	public int anneeNaissance;
	
	
		public Personne() {
	}
	
	public Personne(String nom){
		this.nom = nom;
		
	}
	
	public Personne(int anneeNaissance){
		this.anneeNaissance = anneeNaissance;
	}
	
	public Personne(String nom, int anneeNaissance){
		this.nom = nom;
		this.anneeNaissance = anneeNaissance;
	}
	
	public String getThisValue(){
		return this.toString();
	}
	

	public int age() {
		return 2021 - anneeNaissance;
	}

}
