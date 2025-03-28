package protagonistes;
import affrontement.*;
import armes.*;

public class Homme extends EtreVivant{
	private Arme maPossession;

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
		if(maPossession!=null) {
			lacher();
		}
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
	
	public String lacher() {
		String chaine="";
		if (maPossession==null) {
			chaine = getNom() + " tente de se séparer de son arme, mais à oublié qu'il a les mains vides...\n";
		}
		else {
			chaine = (getNom() + " a lâché son " + maPossession.getNature() +"\n");
			maPossession.lacher();
			maPossession=null;
		}
		return chaine;
		
	}
	
	
	public String prendre(Arme arme) {
		String chaine="";
		if (maPossession!=null) {
			chaine+= getNom() + " lache son " + maPossession.getNature() + ".\n";
			lacher();
		}
		if (arme.estPris()) {
			chaine+= parler(arme.getProprietaire().getNom() + " peux tu me laisser ton "+ arme.getNature() + " ?");
			chaine+=arme.getProprietaire().parler("Pas de soucis, cela me permettra de reprendre mon souffle.");
			chaine+=arme.getProprietaire().lacher();
		}
		if(arme instanceof Epee) {
			chaine+=prendreEpee((Epee) arme);
			maPossession=arme;
			arme.setProprietaire(this);
		}
		else {
			chaine+=parler("Je prends mon "+arme.getNature()+".");
			maPossession=arme;
			arme.setProprietaire(this);
		}
		return chaine;
	}
	
	public String combattre(Dragon dragon) {
		String chaine="";
		if(maPossession==null) {
			chaine+=getNom() + " s'attaque sans aucune arme à "+ dragon.getNom() +".\n";
			chaine+=mourir();
		}
		else {
			chaine+=maPossession.attaque(dragon);
		}
		return chaine;
		
	}
	
	public String prendreEpee(Epee epee) {
		String chaine="";
		this.vie-=10;
		chaine+=parler("Je prends l'épée même si pour cela je dois perdre des forces.");
		if (vie<=0) {
			chaine+=getNom() + " a voulu prendre l'épée, mais son état de fatigue ne lui permettait pas cet ultime effort, il en est mort ! \n";
			chaine+=mourir();
		}

		return chaine;
	}
	
	
	
	
	
	
	
	
	
}
