package ZooNeuvot;

public class Animal 
{
	private String name;				// Nom de l'espèce
	private String sex;					// Sexe "Male" ou "Femelle"
	private double weight;				// Poids en Kg
	private double size;				// Taille en cm
	private int age;					// Age de l'animal
	private boolean hungerIndicator; 	// Indicateur de faim - true (a faim) false (n'a pas faim)
	private boolean sleepingIndicator; 	// Indicateur de sommeil - true (il dort) false (il ne dort pas)
	private boolean healthIndicator; 	// Indicateur de santé - true (en bonne santé) false (en mauvaise santé)

	
	// Constructeur
	public Animal(String name, String sex, double weight, double size, int age) 
	{
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.size = size;
		this.age = age;
		this.hungerIndicator = false;
		this.sleepingIndicator = false;
		this.healthIndicator = false;
	}

	// Retourne 1 pour le bon endormissement de l'animal, retourne 0 si l'animal dort déjà
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
		return "agrou agrou agrou oui";
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
	
	// Retourne 0 si l'animal est déjà réveillé, retourne 1 si l'animal s'est bien réveillé
	public int wakingUp() {
		if (this.sleepingIndicator == false) {
			return 0;
		}
		else {
			this.sleepingIndicator = false;
			return 1;
		}
	}
	
	// Retourne 0 si l'animal est déjà en bonne santé, retourne 1 si l'animal a correctement été soigné
	public int heal() {
		if (this.healthIndicator == true) {
			return 0;
		}
		else {
			this.healthIndicator = true;
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Animal : [name=" + name + ", sex=" + sex + ", weight=" + weight + ", size=" + size + ", age=" + age
				+ ", hungerIndicator=" + hungerIndicator + ", sleepingIndicator=" + sleepingIndicator
				+ ", healthIndicator=" + healthIndicator + "]";
	}
	
}
