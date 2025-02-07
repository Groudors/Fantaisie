package protagonistes;

public class Homme extends EtreVivant{

	public Homme(String nom) {
		super(nom);	
		this.vie=100;
		}
	
	public String parler(String texte) {
		return (getNom() + " : " + texte + "\n");
		
	}

}
