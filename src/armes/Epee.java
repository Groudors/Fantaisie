package armes;

public class Epee extends Arme{
	String nom;

	public Epee(String nom) {
		super("Épée", 80);
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}

}
