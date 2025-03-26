package test_fonctionnel;

import controleur.ControleurCreerProtagoniste;
import protagonistes.StockEtreVivant;
import protagonistes.TypeEtreVivant;

public class TestControleur {
	public static void main(String[] args) {
		StockEtreVivant stockEtreVivant = new StockEtreVivant();
		ControleurCreerProtagoniste controleurCreerProtagoniste = new ControleurCreerProtagoniste(stockEtreVivant);

		controleurCreerProtagoniste.creerEtreVivant(TypeEtreVivant.HEROS, "Arthur");
		controleurCreerProtagoniste.creerEtreVivant(TypeEtreVivant.HOMME, "Thomas");
		controleurCreerProtagoniste.creerEtreVivant(TypeEtreVivant.DRAGON, "Dragon noir");
		controleurCreerProtagoniste.creerEtreVivant(TypeEtreVivant.HOMME, "Jacques");
		
		System.out.println("La liste des personnages non affect�es � une bataille est : ");
		System.out.println(stockEtreVivant.afficherEtreVivant());

		// RESULTAT ATTENDU
		// La liste des personnages non affect�es � une bataille est :
		// - 1 - le h�ros Arthur
		// - 2 - l'homme Thomas
		// - 3 - l'homme Jacques
		// - 4 - le dragon Dragon noir
	}
}
