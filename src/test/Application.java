package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		int choix, numEtudiant, numProf;
		String nom, prenom;
		Scanner sc = new Scanner(System.in);
		
		Etudiant etudiant;
		Professeur professeur;
		
		ArrayList<Personne> liste = new ArrayList<Personne>();
		
		ObjectInputStream ois;
		ObjectOutputStream oos;
		
		try 
		{	
			oos = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( new File("personne.txt"))));
			ois = new ObjectInputStream( new BufferedInputStream( new FileInputStream( new File("personne.txt"))));
			try 
			{
				System.out.println("1. Creer un etudiant");
				System.out.println("2. Creer un professeur");
				System.out.println("3. Afficher les etudiants");
				System.out.println("4. Afficher les professeur");
				System.out.println("5. Quitter");
				System.out.println("Faite votre choix ?");
				choix = sc.nextInt();
				
				switch (choix)
				{
				case 1:
					System.out.println("Numero de l'etudiant ? ");
					numEtudiant = sc.nextInt();
					sc.nextLine();
					System.out.println("Prenom ? ");
					prenom = sc.nextLine();
					System.out.println("Nom ? ");
					nom = sc.nextLine();
					
					etudiant = new Etudiant(numEtudiant, nom, prenom);
					
					oos.writeObject(etudiant);
					
					liste.add(etudiant);
					
					break;
					
				case 2:
					System.out.println("Numero du professeur ? ");
					numProf = sc.nextInt();
					sc.nextLine();
					System.out.println("Prenom ? ");
					prenom = sc.nextLine();
					System.out.println("Nom ? ");
					nom = sc.nextLine();
					
					professeur = new Professeur(numProf, nom, prenom);
					
					oos.writeObject(professeur);
					
					liste.add(professeur);
					
					break;
					
				case 3:
					for (Personne personne : liste) {
						System.out.println(((Etudiant)ois.readObject()).toString());
					}
				default:
					System.out.println("Choix impossible !");
					break;
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally
			{
				ois.close();
				oos.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}


	}
	
}
