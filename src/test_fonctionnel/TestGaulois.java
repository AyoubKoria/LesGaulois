package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		System.out.println();
		Gaulois asterix = new Gaulois("Ast�rix", 10);
		Gaulois obelix = new Gaulois("Ob�lix", 16);

		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");

		Romain minus = new Romain("Minus", 6);

		System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez � nez avec le romain " + minus.getNom());
		
		
			
		}
	        }    