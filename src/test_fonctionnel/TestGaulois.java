package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		System.out.println();
		Gaulois asterix = new Gaulois("Astérix", 10);
		Gaulois obelix = new Gaulois("Obélix", 16);

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		Romain minus = new Romain("Minus", 6);

		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez à nez avec le romain " + minus.getNom());
		
		for {
			
		}
	}

}