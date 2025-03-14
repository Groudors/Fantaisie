package protagonistes;
import affrontement.*;

public class Homme extends EtreVivant{

	public Homme(String nom) {
		super(nom);	
		this.vie=100;
		}
	
	public String parler(String texte) {
		return (getNom() + " : " + texte + "\n");
		
	}
	
	@Override
	public String rejointBataille(Bataille bataille) {
		this.bataille=bataille;
		return bataille.ajouter(this);
		
	}
	@Override
	public String mourir() {
		String texte =bataille.eliminer(this);
		return("C'est ainsi que le courageux " + getNom() + " mourut. \n" + texte);
		
	}
	
	public String subirAttaque(int forceAttaque) {
		String chaine= getNom() + " subit une violente attaque, ";
		this.vie-=forceAttaque;
		if (vie>0) {
			chaine+=(" mais il parvient à se relever \n");
		}
		else { 
			chaine+=(" trop violente pour survivre \n");
			chaine+=mourir();
	
		}
		return chaine;
	}
}
