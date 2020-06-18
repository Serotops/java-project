package ZooNeuvot;

public abstract class Marine extends Animal 
{

	public Marine(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Marine(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}
	
	@Override
	public String MakingNoise() 
	{
		return "Gloup Gloup";
	}
	
	@Override
	public String Move()
	{
		return " *Nage* ";
	}

}
