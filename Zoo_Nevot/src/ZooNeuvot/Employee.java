package ZooNeuvot;

public class Employee 
{
	private String name;			// Nom de l'emplyé
	private String sex;				// Sexe de l'employé
	private int age;				// Age de l'employé
	
	/* Constructeurs */
	
	public Employee() 
	{
		this.name = "Jean-Michel";
		this.sex = "Homme";
		this.age = 134;
	}

	/* Methodes */
	
	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + "ans]";
	}
	
	public String CheckEnclosure(Enclosure pEnclos)
	{
		
	}
	
}
