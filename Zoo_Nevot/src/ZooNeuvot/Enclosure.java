package ZooNeuvot;

import java.util.ArrayList;

public class Enclosure
{
	private String name;					// Nom de l'enclos
	private int area;						// Superficie en m²
	private int ani_max;					// Capacité maximum en animaux 
	private String clean;					// Degre de propreté : "Mauvais", "Correct" ou "Bon"
	private ArrayList<Animal> animals;		// Liste des animaux présents dans l'enclos
	
	/* Methodes */
	
	@Override
	public String toString() 
	{
		return "Enclosure [name=" + name + ", area=" + area + ", ani_max=" + ani_max + ", clean=" + clean + ", animals=" + animals + "]";
	}
	
	// Fonction d'ajout d'animal à l'enclos
	public String AddAnimal(Animal pAnimal)
	{
		String vRet = "Enclos déjà plein";
		
		if(this.animals.size()>=this.ani_max)
		{
			this.animals.add(pAnimal);
			vRet = "Animal ajouté";
		}
		return vRet;
	}
	
	// Fonction de retrait d'animal d'un enclos
	public String RemoveAnimal(Animal pAnimal)
	{
		String vRet = "Enclos Vide";
		
		if(this.animals.size()>0)
		{
			this.animals.remove(pAnimal);
			vRet = "Animal retiré de l'enclos";
		}
		return vRet;
	}
	
	//Fonction permettant d'entretenir l'enclos
	public String CleanEnclosure()
	{
		String vRet = "Enclos déja propre";
		
		if(this.animals.isEmpty())
		{
			if(!"Bon".equals(this.clean))
				this.clean = "Bon";
		}
		else
		{
			vRet = "Impossible ! L'enclos n'est pas vide";
		}
		
		return vRet;
	}
	
	/* Constructeurs */
	
	public Enclosure(String name, int area, int ani_max, String clean) 
	{
		this.name = name;
		this.area = area;
		this.ani_max = ani_max;
		this.clean = "Bon";
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
	
}
