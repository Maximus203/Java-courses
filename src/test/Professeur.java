package test;

public class Professeur extends Personne {
	private int numProf;
	private String nom, prenom;
	public Professeur(int numProf, String nom, String prenom) {
		super();
		this.numProf = numProf;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String toString() {
		return "Bonjour je me presente " + prenom + " " + nom;
	}
	public int getNumProf() {
		return numProf;
	}
	public void setNumProf(int numProf) {
		this.numProf = numProf;
	}
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
	
}
