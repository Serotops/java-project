package ZooNeuvot;

public class Whale extends Marine implements Mammifere
{
	private static final int gestation = 300; // Durée gestation en jours
	
	public Whale(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Whale(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}
	
	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanGiveBirth(this))
		{
			vRet = "Un nouvel animal de l'espèce : " + this.getName() + " est né(e) ! ";
			Whale BabyWhale = new Whale("Baleine", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
