package controleur;
import protagonistes.*;

public class ControleurCreerProtagoniste {
	private StockEtreVivant stock;
	
	
	public ControleurCreerProtagoniste(StockEtreVivant stock) {
		this.stock=stock;
		}
	
	
	public void creerEtreVivant(TypeEtreVivant typeEtreVivant, String nom) {
		switch (typeEtreVivant) {
		case HOMME: {
			Homme homme=new Homme(nom);
			stock.ajouterHomme(homme);
			break;
		}
		case HEROS:{
			Heros heros=new Heros(nom);
			stock.ajouterHeros(heros);
			
			break;
		}
		default:
			Dragon dragon=new Dragon(nom);
			stock.ajouterDragon(dragon);
			
		}
		
	}
}
