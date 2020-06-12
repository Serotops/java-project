package ZooNeuvot;

public class ZooMain 
{

	public static void main(String[] args) 
	{
		Animal Lion = new Animal("Lion", "Male", 90, 120, 18);
		Animal Lionne = new Animal("Lionne", "Femelle", 90, 120, 18);
		
		//System.out.println(Lion.toString());
		
		Enclosure Enclos = new Enclosure("EcLion", 180, 2);
		
		Employee Philippe = new Employee("Philippe", "Homme", 29);
		
		System.out.println(Enclos.toString());
		
		System.out.println(Enclos.AddAnimal(Lion));
		System.out.println(Enclos.AddAnimal(Lionne));
		
		System.out.println(Philippe.CheckEnclosure(Enclos));
		System.out.println(Philippe.CleanEnclosure(Enclos));
	}

}
