package ZooNeuvot;

import java.util.ArrayList;

public class Zoo 
{
	private String name;
	private Employee Perso;
	private int max_enclosures;
	private ArrayList<Enclosure> Enclos = new ArrayList<>();
	
	/* Constructeur */
	
	public Zoo(Employee pPerso)
	{
		this.name = "Zoo Nevot";
		this.Perso = pPerso;
		this.max_enclosures = 10;
	}
	
	/* Methodes */
	
	public int nb_AnimalsInZoo()
	{
		int vRet = 0;
		
		for(Enclosure pEnclos : Enclos)
		{
			for(Animal pAni : pEnclos.getAnimals())
			{
				vRet ++ ;
			}
		}
		return vRet;
	}
	
	public String info_AnimalInZoo()
	{
		String vRet = "";
		
		for(Enclosure pEnclos : Enclos)
		{
			for(Animal pAni : pEnclos.getAnimals())
			{
				vRet += pAni.toString() + '\n';
			}
		}
		return vRet;
	}
}
