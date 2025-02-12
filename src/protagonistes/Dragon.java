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
}
