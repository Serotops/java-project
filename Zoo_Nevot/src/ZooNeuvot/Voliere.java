package ZooNeuvot;

import java.util.ArrayList;

public class Voliere extends Enclosure
{
	private double height; 		// Hauteur de l'enclos en mètre(s)
	private ArrayList<Fly> AniVolant = new ArrayList<>();
	
	/* Constructeur */
	
	public Voliere(String name, int area, int ani_max, String clean, double height) 
	{
		super(name, area, ani_max, clean);
		this.height = height;
	}
	
	/* Methodes */
	
	public String AddAnimal(Fly pFly) 
	{
		return super.AddAnimal(pFly);
	}

	public boolean ContainAnimal(Fly pFly) 
	{
		return super.ContainAnimal(pFly);
	}
	
	@Override
	public boolean BeCleanable() 
	{
		return super.BeCleanable();
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	

}
