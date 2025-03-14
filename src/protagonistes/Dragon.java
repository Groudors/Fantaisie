package protagonistes;
import affrontement.*;
public class Dragon extends EtreVivant{
	public Dragon(String nom) {
		super(nom);	
		this.vie=200;
		}
	
	@Override
	public String rejointBataille(Bataille bataille) {
		this.bataille=bataille;
		return bataille.ajouter(this);
		
	}
	@Override 
	public String mourir() {
		String texte = bataille.eliminer(this);
		return("C'est ainsi que le dragon " + getNom() + " mourut. \n" + texte);
		
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
