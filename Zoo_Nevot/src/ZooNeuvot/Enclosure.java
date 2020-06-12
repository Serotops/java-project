package ZooNeuvot;

import java.util.ArrayList;

public class Enclosure
{
	private String name;										// Nom de l'enclos
	private int area;											// Superficie en m²
	private int ani_max;										// Capacité maximum en animaux 
	private String clean;										// Degre de propreté : "Mauvais", "Correct" ou "Bon"
	private ArrayList<Animal> animals = new ArrayList<Animal>();// Liste des animaux présents dans l'enclos
	
	/* Methodes */
	
	@Override
	public String toString() 
	{
		return "Enclos : " + name + ", a pour superficie " + area + " m², pour une capcité de " + ani_max + ", est dans un état de propreté " + clean  
				+ ". Il contient les animaux suivants : " + animals + "]";
	}
	
	// Fonction d'ajout d'animal à l'enclos
	public String AddAnimal(Animal pAnimal)
	{
		String vRet = "Enclos déjà plein";
		
		if(this.animals.size()<this.ani_max)
		{
			this.animals.add(pAnimal);
			vRet = "Animal ajouté";
		}
		return vRet;
	}
	
	// Fonction de retrait d'animal d'un enclos
	public String RemoveAnimal(Animal pAnimal)
	{
		String vRet = "Cet animal n'est pas présent dans l'enclos";
		
		if(this.animals.contains(pAnimal))
		{
			this.animals.remove(pAnimal);
			vRet = "Animal retiré de l'enclos";
		}
		return vRet;
	}
	
	//Fonction permettant d'entretenir l'enclos
	public boolean BeCleanable()
	{
		boolean vRet = false;
		
		if(!"Bon".equals(this.clean))
			vRet = true;

		return vRet;
	}
	
	/* Constructeurs */
	
	public Enclosure(String name, int area, int ani_max) 
	{
		this.name = name;
		this.area = area;
		this.ani_max = ani_max;
		this.clean = "Mauvais";
	}

	/* Accesseurs */

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getArea() 
	{
		return area;
	}
	
	public void setArea(int area) 
	{
		this.area = area;
	}
	
	public int getAni_max() 
	{
		return ani_max;
	}
	
	public void setAni_max(int ani_max) 
	{
		this.ani_max = ani_max;
	}
	
	public String getClean() 
	{
		return clean;
	}
	
	public void setClean(String clean) 
	{
		this.clean = clean;
	}

	public ArrayList<Animal> getAnimals() 
	{
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) 
	{
		this.animals = animals;
	}

}
