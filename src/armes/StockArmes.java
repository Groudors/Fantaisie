package armes;

import java.util.ArrayList;
import java.util.List;

public class StockArmes {
	private List<Epee> epees = new ArrayList<>();
	private List<Arc> arcs = new ArrayList<>();
	private List<LancePierre> lancePierre = new ArrayList<>();

	public void ajouterArme(Epee epee) {
		epees.add(epee);
	}

	public void ajouterArme(Arc arc) {
		arcs.add(arc);
	}

	public void ajouterArme(LancePierre lancePierrex) {
		lancePierre.add(lancePierrex);
	}

	public String afficherArmes() {
		String chaine = "";
		int i = 1;
		for (Epee epee : epees) {
			chaine += "- " + i + " - l'épée " + epee.getNom() + "\n";
			i++;
		}
		for (Arc arc : arcs) {
			chaine += "- " + i + " - un arc avec " + arc.getNombreFleche();
			if (arc.getNombreFleche() > 1) {
				chaine += " flèches\n";
			} else {
				chaine += " flèche\n";
			}
			i++;
		}

		for (int j = 0; j < lancePierre.size(); j++) {
			chaine += "- " + i + " - un lance-pierre\n";
			i++;
		}
		return chaine;
	}

	public Arme selectionner(int numero) {
		numero--;
		if (numero < epees.size()) {
			return epees.get(numero);
		}
		if (numero < epees.size() + arcs.size()) {
			numero -= epees.size();
			return arcs.get(numero);
		}
		numero -= epees.size();
		numero -= arcs.size();
		return lancePierre.get(numero);
	}

	public void supprimerArme(Arme arme) {
		if (arme instanceof Epee) {
			epees.remove(arme);
		} else {
			if (arme instanceof Arc) {
				arcs.remove(arme);
			} else {
				lancePierre.remove(arme);
			}

		}
	}
	
	public int donnerNombreArme() {
		return epees.size() + arcs.size() + lancePierre.size();
	}
}
