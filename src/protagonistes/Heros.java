package protagonistes;

public class Heros extends EtreVivant {
	public Heros(String nom) {
		super(nom);	
		this.vie=150;
		}
	
	public String parler(String texte) {
		return ("Le héros " + getNom() + " : " + texte + "\n");
	}

}
