package test;

public class Etudiant extends Personne {
	private int numEtudiant;
	private String nom, prenom;
	public Etudiant(int numEtudiant, String nom, String prenom) {
		super();
		this.numEtudiant = numEtudiant;
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Yo ! Je suis un etudiant et je m'appele " + prenom + " " + nom;
			
	}
	public int getNumEtudiant() {
		return numEtudiant;
	}
	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
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
