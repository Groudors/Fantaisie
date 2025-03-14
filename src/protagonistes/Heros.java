package protagonistes;

import armes.Epee;

public class Heros extends Homme {
	public Heros(String nom) {
		super(nom);	
		this.vie=150;
		}
	@Override
	public String parler(String texte) {
		return ("Le héros " + getNom() + " : " + texte + "\n");
	}
	
	@Override
	public String prendreEpee(Epee epee) {
		String chaine="";
		chaine+=parler("Je prends "+epee.getNom()+".");
		
		
		return chaine;
		
	}

}
