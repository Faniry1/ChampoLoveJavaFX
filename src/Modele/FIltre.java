package Modele;

import java.util.ArrayList;

public class FIltre {
	
	private Physique physiqueRechercher;
	private ArrayList<Hobbie> hobbiesRechercher;
	private int ageRechercher;
	private SigneAstro signeAstroRechercher;
	private Genre genreRechercher;
	private Ville villeRechercher;
	
	public FIltre(Physique physiqueRechercher, ArrayList<Hobbie> hobbiesRechercher, int ageRechercher,
			SigneAstro signeAstroRechercher, Genre genreRechercher,Ville villeRechercher) {
		super();
		this.physiqueRechercher = physiqueRechercher;
		this.hobbiesRechercher = hobbiesRechercher;
		this.ageRechercher = ageRechercher;
		this.signeAstroRechercher = signeAstroRechercher;
		this.genreRechercher = genreRechercher;
		this.villeRechercher = villeRechercher;
		
	}

	public Physique getPhysiqueRechercher() {
		return physiqueRechercher;
	}

	public ArrayList<Hobbie> getHobbiesRechercher() {
		return hobbiesRechercher;
	}

	public int getAgeRechercher() {
		return ageRechercher;
	}

	public SigneAstro getSigneAstroRechercher() {
		return signeAstroRechercher;
	}

	public Genre getGenreRechercher() {
		return genreRechercher;
	}

	public Ville getVilleRechercher() {
		return villeRechercher;
	}
	
	
	
	
	
	

}
