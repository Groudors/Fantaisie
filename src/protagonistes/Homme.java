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
}
