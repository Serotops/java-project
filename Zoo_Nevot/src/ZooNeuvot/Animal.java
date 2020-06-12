package ZooNeuvot;

public class Animal 
{
	private String name;		// Nom de l'esp�ce
	private String sex;			// Sexe "Male" ou "Female"
	private double weight;		// Poids en Kg
	private double size;		// Taille en cm
	private int age;			// Age de l'animal
	private boolean hungerIndicator = true; // Indicateur de faim - true (a faim) false (n'a pas faim)
	private boolean sleepingIndicator = false; // Indicateur de sommeil - true (il dort) false (il ne dort pas)
	private boolean healthIndicator; // Indicateur de sant� - true (en bonne sant�) false (en mauvaise sant�)
	
	// Retourne 1 pour le bon endormissement de l'animal, retourne 0 si l'animal dort d�j�
	public int sleeping() {
		if (this.sleepingIndicator == false) {
			this.sleepingIndicator = true;
		}
		else {
			return 0;
		}
		
		return 1;
	}
	
	public String makingSound()
	{
		return "agrou agrou agrou";
	}

	// Retourne 0 si l'animal n'a pas faim, retourne 1 si l'animal a bien manger
	public int eat() {
		if (this.sleepingIndicator == true) {
			return 0;
		}
		else {
			this.hungerIndicator = false;
			return 1;
		}
	}
	
	// Retourne 0 si l'animal est d�j� r�veill�, retourne 1 si l'animal s'est bien r�veill�
	public int wakingUp() {
		if (this.sleepingIndicator == false) {
			return 0;
		}
		else {
			this.sleepingIndicator = false;
			return 1;
		}
	}
	
	// Retourne 0 si l'animal est d�j� en bonne sant�, retourne 1 si l'animal a correctement �t� soign�
	public int heal() {
		if (this.healthIndicator == true) {
			return 0;
		}
		else {
			this.healthIndicator == true;
			return 1;
		}
	}
}
