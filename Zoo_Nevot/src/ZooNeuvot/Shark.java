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

	public String LayEgg()
	{
		String vRet = "Cet animal ne peut pas pondre";
		
		if(this.CanLayEgg(this))
		{
			vRet = "Un nouveau requin est né(e) ! ";
			Shark BabyShark = new Shark("Requin", this.RandomSex(), this.RandomWeight(), this.RandomSize());
		}
		return vRet;
	}

}
