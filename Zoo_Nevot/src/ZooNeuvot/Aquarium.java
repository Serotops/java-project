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
	
	@Override
	public boolean BeCleanable() 
	{
		return super.BeCleanable();
	}

	public double getDeep() 
	{
		return deep;
	}

	public void setDeep(double deep) 
	{
		this.deep = deep;
	}

	public boolean isSalinity() 
	{
		return salinity;
	}

	public void setSalinity(boolean salinity) 
	{
		this.salinity = salinity;
	}

}
