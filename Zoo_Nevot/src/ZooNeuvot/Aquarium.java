package ZooNeuvot;

public class Aquarium extends Enclosure 
{
	private double deep; 		// Profondeur du bassin en mètre
	private boolean salinity; 	// Salinité de l'eau : True = Bonne / False : A rectifier
	
	/* Constructeurs */
	
	public Aquarium(String name, int area, int ani_max, double deep, boolean salinity) 
	{
		super(name, area, ani_max);
		this.deep = deep;
		this.salinity = salinity;
	}

}
