package ZooNeuvot;

public class RedFish extends Marine implements Other
{
	private static final int incubation = 14; // Durée d'incubation en jours
	
	public RedFish(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public RedFish(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouvel animal de l'espèce : " + this.getName() + " est né(e) ! ";
			RedFish BabyRedFish = new RedFish("Poisson Rouge", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
