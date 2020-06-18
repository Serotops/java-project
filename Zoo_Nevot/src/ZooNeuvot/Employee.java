package ZooNeuvot;

public class Employee 
{
	private String name;			// Nom de l'emplyé
	private String sex;				// Sexe de l'employé
	private int age;				// Age de l'employé
	
	/* Constructeurs */
	
	public Employee(String name, String sex, int age) 
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	/* Methodes */
	
	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + "ans]";
	}
	
	public String CheckEnclosure(Enclosure pEnclos)
	{
		return pEnclos.toString();
	}
	
	public String CleanEnclosure(Enclosure pEnclos)
	{
		String vRet = "Enclos deja propre";
		
		if(pEnclos.BeCleanable())
		{
			switch(pEnclos.getClass().toString())
			{
				case "class ZooNeuvot.Aquarium" :
					pEnclos.setClean("Bon");
					((Aquarium) pEnclos).setSalinity(true);
					vRet = "Aquarium nettoyé, salinité de l'eau ok";
					break;
					
				case "class ZooNeuvot.Voliere" : 
					pEnclos.setClean("Bon");
					vRet = "Cage et son toit néttoyé";
					break;
			
				default : 
					pEnclos.setClean("Bon");
					vRet = "Enclos nettoyé";
			}
		}
		return vRet;
	}
	
	public String FeedInEnclos(Enclosure pEnclos)
	{
		String vRet = "";
		
		for(Animal Ani : pEnclos.getAnimals())
		{
			if(Ani.beFed())
			{
				Ani.setHungerIndicator(false);
				vRet += Ani.getName() + " nourri, ";
			}
			else
				vRet = "Tous les animaux sont déjà nourris";
		}
		return vRet;
	}
	
	public String TransferAnimal(Enclosure pEnclosOrigin, Enclosure pNextEnclos, Animal pAnimal)
	{
		String vRet = "";
		return vRet;
	}
	
}
