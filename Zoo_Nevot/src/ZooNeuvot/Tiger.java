package ZooNeuvot;

public class Tiger extends Land implements Mammifere
{
	private static final int gestation = 100; // Durée gestation en jours
	
	public Tiger(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Tiger(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanGiveBirth(this))
		{
			vRet = "Un nouveau tigre est né(e) ! ";
			Tiger BabyTiger = new Tiger("Tigre", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}
}
