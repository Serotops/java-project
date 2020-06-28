package ZooNeuvot;

public class Penguin extends Fly implements Other
{
	private static final int incubation = 35; // Durée d'incubation en jours
	
	public Penguin(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Penguin(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String LayEgg()
	{
		String vRet = "Cet animal ne peut pas pondre";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouveau pingouin est né(e) ! ";
			Penguin BabyPenguin = new Penguin("Pingouin", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}
}
