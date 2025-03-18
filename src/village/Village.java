package village;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int NB_VILLAGEOIS_MAX;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageois) {
		this.nom = nom;
		this.NB_VILLAGEOIS_MAX = nbVillageois;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numeroVillageois) {
		if (villageois[numeroVillageois] == null) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village");
			return null;
		} else {
			return villageois[numeroVillageois];
		}
	}

	public static void main(String[] args) {
		Village premierVillage = new Village("Village des Irréductibles", 30);
		Gaulois asterix = new Gaulois("Astérix", 6);
		premierVillage.ajouterVillageois(asterix);
	}
}
