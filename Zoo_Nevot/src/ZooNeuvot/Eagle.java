package ZooNeuvot;

public class Eagle extends Fly implements Other
{
	private static final int incubation = 40; // Durée d'incubation en jours 
	
	public Eagle(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Eagle(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouvel animal de l'espèce : " + this.getName() + " est né(e) ! ";
			Eagle BabyEagle = new Eagle("Aigle", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
