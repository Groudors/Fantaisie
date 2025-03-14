package protagonistes;
import affrontement.*;
public class Dragon extends EtreVivant{
	int nbBDF=10;
	
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
	
	public String cracheBouleFeu(Homme homme) {
		String chaine="";
		if (nbBDF==0){
			return (getNom() + " a voulu attaquer "+ homme.getNom() + " , mais il n'avait plus de feu en lui.\n"
					+ homme.getNom() + " a eu beaucoup de chance ! ");
		}
		else {
			nbBDF-=1;
			chaine=getNom() + " crache une boule de feu sur " + homme.getNom() + "! \n";
			chaine+=homme.subirAttaque(100);
			return chaine;
		}
		
	}
	
	
	
}
