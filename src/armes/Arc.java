package armes;

import protagonistes.Dragon;

public class Arc extends Arme{
	private int nombreFleche;

	public Arc(int nombreFleche) {
		super("Arc", 30);
		this.nombreFleche=nombreFleche;
}
public int getNombreFleche() {
	return nombreFleche;
}

@Override 
public String attaque(Dragon dragon) {
	if (getNombreFleche()==0){
		return ("Malheureusement, il ne possédait plus de flèche \n");
	}
	else {
		this.nombreFleche-=1;
		return(super.attaque(dragon));
	
	}
}


}
