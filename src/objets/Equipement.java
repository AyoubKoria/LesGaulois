package objets;

public enum Equipement {
	BOUCLIER("bouclier"), CASQUE("casque");

	String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
}
