package ZooNeuvot;

public class Penguin extends Fly implements Other
{
	private static final int incubation = 35; // Dur�e d'incubation en jours
	
	public Penguin(String name, String sex, double weight, double size, int age) 
	{
		super(name, sex, weight, size, age);
	}
	
	public Penguin(String name, String sex, double weight, double size)
	{
		super(name, sex, weight, size);
	}

	public String GiveBirth()
	{
		String vRet = "Cet animal ne peut pas mettre bas";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouvel animal de l'esp�ce : " + this.getName() + " est n�(e) ! ";
			Penguin BabyPenguin = new Penguin("Pingouin", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}
}
