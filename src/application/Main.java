package application;

import examCnam.ElementGraphique;
import examCnam.ElementFixe;
import examCnam.Brique;
import examCnam.Mur;

public class Main {

	public static void main(String[] args) {
		// instancier les classes
		ElementGraphique E1 = new ElementGraphique("balle", 80, 80);
		ElementFixe F1 = new ElementFixe("Titre", 40, 1000, 150, 1300);
		Brique B1 = new Brique("Brique 1", 40, 200, 300, 300, 4);
		Brique B2 = new Brique("Brique 2", 40, 200, 700, 300, 3);

		Mur M1 = new Mur("Mur 1", 40, 20000, 1, 1, "Bleu");
		Mur M2 = new Mur("Mur 2", 20000, 40, 1, 1, "Bleu");
	}

}
