package ZooNeuvot;

public abstract class Land extends Animal
{

	public Land(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Land(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	@Override
	public String MakingNoise() 
	{
		return "Agrou Agrou";
	}
	
	@Override
	public String Move()
	{
		return " *Vagabonde* ";
	}
	
}
