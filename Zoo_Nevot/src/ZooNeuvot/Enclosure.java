package ZooNeuvot;

import java.util.ArrayList;

public class Enclosure
{
	private String name;											// Nom de l'enclos
	private int area;												// Superficie en m�
	private int ani_max;											// Capacit� maximum en animaux 
	private String clean;											// Degre de propret� : "Mauvais", "Correct" ou "Bon"
	private ArrayList<Animal> animals = new ArrayList<>();			// Liste des animaux pr�sents dans l'enclos
	
	/* Methodes */
	
	@Override
	public String toString() 
	{
		return "Enclos : " + name + ", a pour superficie " + area + " m�, pour une capcit� de " + ani_max + ", est dans un �tat de propret� " + clean  
				+ ". Il contient les animaux suivants : " + animals + "]";
	}
	
	// Fonction d'ajout d'animal � l'enclos
	public String AddAnimal(Animal pAnimal)
	{
		String vRet = "Enclos d�j� plein";
		
		if(!isFull())
		{
			if(isEmpty())
			{
				this.animals.add(pAnimal);
				vRet = pAnimal.getName() + " ajout� � l'enclos " + this.name;
			}
			else
			{
				if(pAnimal.getClass().equals(this.animals.get(0).getClass()))
				{
					this.animals.add(pAnimal);
					vRet = pAnimal.getName() + " ajout� � l'enclos " + this.name;
				}
				else
				{
					vRet = "Cet enclos contient d�j� une autre esp�ce d'animal";
				}
			}

		}
		return vRet;
	}
	
	// Fonction de retrait d'animal d'un enclos
	public String RemoveAnimal(Animal pAnimal)
	{
		String vRet = "Cet animal n'est pas pr�sent dans l'enclos";
		
		if(ContainAnimal(pAnimal))
		{
			this.animals.remove(pAnimal);
			vRet = "Animal retir� de l'enclos";
		}
		return vRet;
	}
	
	public String FeedAnimals()
	{
		String vRet = "";
		
		for(Animal pAni : this.animals)
		{
			if(pAni.isHungerIndicator())
			{
				pAni.setHungerIndicator(false);
				vRet += pAni.getName() + " a �t� nourri, ";
			}
			else
				vRet = "Aucun animal de cet enclos n'a faim";
		}
		return vRet;
	}
	
	//Fonction permettant d'entretenir l'enclos
	public boolean BeCleanable()
	{
		boolean vRet = false;
		
		if((!"Bon".equals(this.clean)) && (this.isEmpty()))
			vRet = true;

		return vRet;
	}
	
	public boolean ContainAnimal(Animal pAni)
	{
		boolean vRet = false;
		
		if(this.animals.contains(pAni))
			vRet = true;
		
		return vRet;
	}
	
	public boolean isFull()
	{
		boolean vRet = false;
		
		if(this.animals.size()>=this.ani_max)
			vRet = true;
		
		return vRet;
	}
	
	public boolean isEmpty()
	{
		return this.animals.isEmpty();
	}
	
	/* Constructeurs */
	
	public Enclosure(String name, int area, int ani_max, String clean) 
	{
		this.name = name;
		this.area = area;
		this.ani_max = ani_max;
		this.clean = clean;
	}
	
	public Enclosure(String name, int area, int ani_max) 
	{
		this.name = name;
		this.area = area;
		this.ani_max = ani_max;
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
