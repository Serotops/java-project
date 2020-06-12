package ZooNeuvot;

public class Voliere extends Enclosure
{
	private double height; 		// Hauteur de l'enclos en mètre(s)
	
	/* Constructeur, héritage de classe mère Enclosure */
	
	public Voliere(String name, int area, int ani_max, double height) 
	{
		super(name, area, ani_max);
		this.height = height;
	}

}
