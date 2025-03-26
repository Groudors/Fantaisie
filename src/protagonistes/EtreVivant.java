package protagonistes;
import affrontement.*;

abstract public class EtreVivant {
	protected String nom;
	protected int vie;
	protected Bataille bataille;

	
	protected EtreVivant(String nom) {
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String rejointBataille(Bataille bataille) {
		this.bataille=bataille;
		return "";
	}
	
	abstract public String mourir();
	
	
}
