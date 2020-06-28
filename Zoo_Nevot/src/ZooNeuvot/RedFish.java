package ZooNeuvot;

public class RedFish extends Marine implements Other
{
	private static final int incubation = 14; // Dur�e d'incubation en jours
	
	public RedFish(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public RedFish(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String LayEgg()
	{
		String vRet = "Cet animal ne peut pas pondre";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouveau poisson rouge est n�(e) ! ";
			RedFish BabyRedFish = new RedFish("Poisson Rouge", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
