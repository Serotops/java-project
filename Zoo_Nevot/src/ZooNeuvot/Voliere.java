package ZooNeuvot;

public class Voliere extends Enclosure
{
	private double height; 		// Hauteur de l'enclos en m�tre(s)
	
	/* Constructeur, h�ritage de classe m�re Enclosure */
	
	public Voliere(String name, int area, int ani_max, double height) 
	{
		super(name, area, ani_max);
		this.height = height;
	}

}