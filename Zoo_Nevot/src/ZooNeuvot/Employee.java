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
			pEnclos.setClean("Bon");
			vRet = "Enclos nettoyé";
		}
		return vRet;
	}
	
}
