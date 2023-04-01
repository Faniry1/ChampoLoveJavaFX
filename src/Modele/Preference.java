package Modele;

import java.util.ArrayList;

public class Preference {
	
	private Physique physiqueVoulue;
	private ArrayList<Hobbie> hobbiesVoulue;
	private int ageVoulue;
	private SigneAstro signeAstro;
	
	private String description;

	public Preference(Physique physiqueVoulue, ArrayList<Hobbie> hobbiesVoulue, int ageVoulue, String description, SigneAstro signeAstro) {
		super();
		this.physiqueVoulue = physiqueVoulue;
		this.hobbiesVoulue = hobbiesVoulue;
		this.ageVoulue = ageVoulue;
		this.signeAstro = signeAstro;
		this.description = description;
	}

	public Physique getPhysiqueVoulue() {
		return physiqueVoulue;
	}

	public void setPhysiqueVoulue(Physique physiqueVoulue) {
		this.physiqueVoulue = physiqueVoulue;
	}

	public ArrayList<Hobbie> getHobbiesVoulue() {
		return hobbiesVoulue;
	}

	public void setHobbiesVoulue(ArrayList<Hobbie> hobbiesVoulue) {
		this.hobbiesVoulue = hobbiesVoulue;
	}

	public int getAgeVoulue() {
		return ageVoulue;
	}

	public void setAgeVoulue(int ageVoulue) {
		this.ageVoulue = ageVoulue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SigneAstro getSigneAstro() {
		return signeAstro;
	}

	public void setSigneAstro(SigneAstro signeAstro) {
		this.signeAstro = signeAstro;
	}
	
	
	
	
	
	
	

}
