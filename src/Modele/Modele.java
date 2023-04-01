package Modele;

import java.sql.Date;
import java.util.ArrayList;

public class Modele {
	
	private ArrayList<Utilisateur> listeUtilisateur;
		
	
	public Modele() {
		super();
		this.listeUtilisateur = new ArrayList<Utilisateur>();
	}



	public void creationUtilisateur(String nom, String prenom, Genre genre, String oriantation, String metier, 
			String mail,int numeroTel, Date dateDeNaissance, Ville ville, String photo, ArrayList<Hobbie> hobbies,
			String description, int taille, int poid, CouleurCheveux couleurCheuveux, CouleurYeux couleurYeux,
			CouleurPeau couleurPeau,int tailleVoulu, int poidVoulue, CouleurCheveux couleurCheuveuxVoulue, 
			CouleurYeux couleurYeuxVoulue,CouleurPeau couleurPeauVoulue,ArrayList<Hobbie> hobbiesVoulue, 
			int ageVoulue, String descriptionVoulue, SigneAstro signeAstroVoulue
			) {
		
		Physique physiqueDemander = new Physique(tailleVoulu,poidVoulue,couleurCheuveuxVoulue, 
										couleurYeuxVoulue,couleurPeauVoulue);
		Physique physique = new Physique(taille,poid,couleurCheuveux,couleurYeux,couleurPeau);
		
		Preference preference = new Preference(physiqueDemander,hobbiesVoulue,ageVoulue,descriptionVoulue,signeAstroVoulue);
		
		Utilisateur utilisateur = new Utilisateur(nom, prenom, genre, oriantation, metier, 
			mail,numeroTel, dateDeNaissance,ville ,photo,physique, hobbies, description, preference);
		
		listeUtilisateur.add(utilisateur);
		
	}
	
	
	
	
	
	

}
