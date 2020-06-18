package ZooNeuvot;

import java.util.ArrayList;

public class Aquarium extends Enclosure 
{
	private double deep; 		// Profondeur du bassin en mètre
	private boolean salinity; 	// Salinité de l'eau : True = Bonne / False : A rectifier
	private ArrayList<Marine> AniMarins = new ArrayList<>();
	
	/* Constructeurs */
	
	public Aquarium(String name, int area, int ani_max, double deep, boolean salinity) 
	{
		super(name, area, ani_max);
		this.deep = deep;
		this.salinity = salinity;
	}
	
	/* Methodes */
	

	
	@Override
	public boolean BeCleanable() 
	{
		return super.BeCleanable();
	}

	public String AddAnimal(Marine pMarin) 
	{
		return super.AddAnimal(pMarin);
	}

	public boolean ContainAnimal(Marine pMarin) 
	{
		return super.ContainAnimal(pMarin);
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
