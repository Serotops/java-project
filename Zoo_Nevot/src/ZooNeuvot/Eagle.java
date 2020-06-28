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

	public String LayEgg()
	{
		String vRet = "Cet animal ne peut pas pondre";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouvel aigle est né(e) ! ";
			Eagle BabyEagle = new Eagle("Aigle", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
