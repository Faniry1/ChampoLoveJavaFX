package Modele;

import java.sql.Date;
import java.util.ArrayList;

public class Utilisateur {
	
	private String nom ;
	private String prenom ;
	private Genre genre;
	private String oriantation ;
	
	private String metier ;
	private String mail;
	private int numeroTel;
	private Date dateDeNaissance;
	private Ville habiteA;
	
	private String photo;
	private Physique physique;
	private ArrayList<Hobbie> hobbies;
	private String description;
	private Preference preference;
	
	
	public Utilisateur(String nom, String prenom, Genre genre, String oriantation, String metier, String mail,
			int numeroTel, Date dateDeNaissance,Ville ville, String photo, Physique physique, ArrayList<Hobbie> hobbies,
			String description, Preference preference) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.oriantation = oriantation;
		
		this.metier = metier; 
		this.mail = mail;
		this.numeroTel = numeroTel;
		this.dateDeNaissance = dateDeNaissance;
		this.habiteA = ville;
		
		this.photo = photo;
		this.physique = physique;
		this.hobbies = hobbies;
		this.description = description;
		this.preference = preference;
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


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public String getOriantation() {
		return oriantation;
	}


	public void setOriantation(String oriantation) {
		this.oriantation = oriantation;
	}


	public String getMetier() {
		return metier;
	}


	public void setMetier(String metier) {
		this.metier = metier;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getNumeroTel() {
		return numeroTel;
	}


	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Physique getPhysique() {
		return physique;
	}


	public void setPhysique(Physique physique) {
		this.physique = physique;
	}


	public ArrayList<Hobbie> getHobbies() {
		return hobbies;
	}


	public void setHobbies(ArrayList<Hobbie> hobbies) {
		this.hobbies = hobbies;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Preference getPreference() {
		return preference;
	}


	public void setPreference(Preference preference) {
		this.preference = preference;
	}
	
	public SigneAstro trouverSigneAstro() {
		SigneAstro resultat = SigneAstro.Lion;
		
		return resultat;
	}
	
	public int trouverAge() {
		
		
		return 0;
	}
	
	public boolean compareTo(FIltre filtre) {
		
		boolean correspond = true;
		
		SigneAstro signeAstro = trouverSigneAstro();
		
		int age = trouverAge();
		
		
		if (filtre.getGenreRechercher() != null && filtre.getGenreRechercher() == this.genre) {
			correspond = false;
		} else if (filtre.getVilleRechercher() != null && filtre.getVilleRechercher() == this.habiteA) {
			correspond = false;
		} else if (filtre.getAgeRechercher() != -1 && filtre.getAgeRechercher() == age) {
			correspond = false;
		} else if (filtre.getSigneAstroRechercher() != null && filtre.getSigneAstroRechercher() == signeAstro) {
			correspond = false;
		}
		
		
		
		return correspond;
	}
	
	
	
	
	

}
