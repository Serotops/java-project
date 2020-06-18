package ZooNeuvot;

public class Shark extends Marine implements Other
{
	private static final int incubation = 430; // Durée d'incubation en jours
	
	public Shark(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Shark(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouvel animal de l'espèce : " + this.getName() + " est né(e) ! ";
			Shark BabyShark = new Shark("Requin", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
