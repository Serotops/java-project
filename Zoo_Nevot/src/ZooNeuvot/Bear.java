package ZooNeuvot;

public class Bear extends Land implements Mammifere
{
	private static final int gestation = 200; // Durée gestation en jours
	
	public Bear(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Bear(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanGiveBirth(this))
		{
			vRet = "Un nouvel animal de l'espèce : " + this.getName() + " est né(e) ! ";
			Bear BabyBear = new Bear("Ours", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}
	
}
