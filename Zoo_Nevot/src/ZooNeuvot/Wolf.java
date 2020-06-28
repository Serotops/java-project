package ZooNeuvot;

public class Wolf extends Land implements Mammifere
{
	private static final int gestation = 70; // Dur�e gestation en jours
	
	public Wolf(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Wolf(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}
	
	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanGiveBirth(this))
		{
			vRet = "Un nouveau loup est n�(e) ! ";
			Wolf BabyWolf = new Wolf("Loup", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
