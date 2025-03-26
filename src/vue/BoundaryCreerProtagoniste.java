package vue;
import controleur.*;
import protagonistes.*;

public class BoundaryCreerProtagoniste {
	private ControleurCreerProtagoniste controleur;
	
	public BoundaryCreerProtagoniste (ControleurCreerProtagoniste controleur) {
		this.controleur=controleur;
		}
	
	public void creerProtagoniste() {
		int numTypeProtagoniste;
		TypeEtreVivant typeEtreVivant;
		String nom;
		
		System.out.println("Quel type de personnage souhaitez-vous créer? \n 1 - Un héros \n 2 - Un homme \n 3 - Un dragon");
		numTypeProtagoniste=Clavier.entrerClavierInt();
		while(numTypeProtagoniste>3 || numTypeProtagoniste <1) {
			System.out.println("Vous devez entrer un nombre entre 1 et 3 ");
			numTypeProtagoniste=Clavier.entrerClavierInt();
		}
		
		switch (numTypeProtagoniste) {
		case 1: 
			typeEtreVivant=	TypeEtreVivant.HEROS;
			break;

		
		case 2:
			typeEtreVivant=	TypeEtreVivant.HOMME;
			break;
		default:
			typeEtreVivant=	TypeEtreVivant.DRAGON;
			break;
			}
		
		System.out.println("Comment souhaitez-vous l'appeler");
		nom=Clavier.entrerClavierString();
		
		controleur.creerEtreVivant(typeEtreVivant,nom);
	}

}
