package Modele;

public class Physique {
	
	private int taille;
	private int poid;
	private CouleurCheveux couleurCheuveux;
	private CouleurYeux couleurYeux;
	private CouleurPeau couleurPeau;
	
	
	public Physique(int taille, int poid, CouleurCheveux couleurCheuveux, CouleurYeux couleurYeux,
			CouleurPeau couleurPeau) {
		super();
		this.taille = taille;
		this.poid = poid;
		this.couleurCheuveux = couleurCheuveux;
		this.couleurYeux = couleurYeux;
		this.couleurPeau = couleurPeau;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public int getPoid() {
		return poid;
	}


	public void setPoid(int poid) {
		this.poid = poid;
	}


	public CouleurCheveux getCouleurCheuveux() {
		return couleurCheuveux;
	}


	public void setCouleurCheuveux(CouleurCheveux couleurCheuveux) {
		this.couleurCheuveux = couleurCheuveux;
	}


	public CouleurYeux getCouleurYeux() {
		return couleurYeux;
	}


	public void setCouleurYeux(CouleurYeux couleurYeux) {
		this.couleurYeux = couleurYeux;
	}


	public CouleurPeau getCouleurPeau() {
		return couleurPeau;
	}


	public void setCouleurPeau(CouleurPeau couleurPeau) {
		this.couleurPeau = couleurPeau;
	}
	
	
	
	
	
}
