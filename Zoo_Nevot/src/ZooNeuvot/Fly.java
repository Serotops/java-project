package ZooNeuvot;

public abstract class Fly extends Animal
{
	
	public Fly(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Fly(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}
	
	@Override
	public String MakingNoise() 
	{
		return "Piou Piou Piou";
	}
	
	@Override
	public String Move()
	{
		return " *Vole* ";
	}
	
}
