package protagonistes;
import affrontement.*;

public abstract class EtreVivant {
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
}
