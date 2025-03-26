package armes;
import protagonistes.*;

abstract public class Arme {
	private Homme proprietaire;
	private String nature;
	private int degats;
	
	public Arme(String nature, int degats) {
		this.nature=nature;
		this.degats=degats;
		}
	
	public Homme getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(Homme proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public String getNature() {
		return nature;
	}
	
	public Boolean estPris() {
		return (!(proprietaire==null));
	}

	public void lacher() {
		setProprietaire(null);
	}
	
	public String attaque(Dragon dragon) {
		String chaine="";
		chaine+=(proprietaire.getNom()+ " attaque "+ dragon.getNom() + " avec son " + getNature() + ". \n");
	
		chaine +=dragon.subirAttaque(degats);
		
		return chaine;
	}
	

	}
	
	
