package personnages;

import objets.Equipement;

public class Gaulois {
	private String nom;
	// private int force;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	// private String prendreParole() {
	// return "Le Gaulois " + nom + " : ";
	// }
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	// public void frapper(Romain romain) {
	// String nomRomain = romain.getNom();
	// System.out.println(nom + " envoie un grand coup dans la m�choire de " +
	// nomRomain);
	// int forceCoup = force / 3;
	// romain.recevoirCoup(forceCoup);
	// }

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] butin = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; butin != null && i < butin.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = butin[i];
		}
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", force=" + force + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
	}
}
