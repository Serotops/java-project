package ZooNeuvot;

public class ZooMain 
{

	public static void main(String[] args) 
	{
		
		// -------------------------------------------------------------------------------
		
		Bear Ours1 = new Bear("Chuck", "Male", 150, 230, 12);
		Bear Ours2 = new Bear("Baloo", "Femelle", 150, 230, 12);
		
		Eagle Aigle1 = new Eagle("Quinn", "Femelle", 15, 80, 9);
		Eagle Aigle2 = new Eagle("D-eagle", "Male", 15, 80, 9);
		
		Wolf Loup1 = new Wolf("Loupé", "Femelle", 35, 90, 11);
		Wolf Loup2 = new Wolf("Garou", "Male", 35, 90, 11);
		
		Tiger Tigre1 = new Tiger("Sherkan", "Male", 120, 100, 24);
		Tiger Tigre2 = new Tiger("Tigrou", "Femelle", 120, 100, 24);
		
		Whale Baleine1 = new Whale("MobyDick", "Femelle", 400, 130, 2);
		Whale Baleine2 = new Whale("BobyDick", "Male", 400, 130, 2);
		
		RedFish Poisson1 = new RedFish("Strasky", "Femelle", 0.214, 8, 5);
		RedFish Poisson2 = new RedFish("Hutch", "Male", 0.214, 8, 5);
		
		Shark Requin1 = new Shark("Don Lino", "Male", 300, 220, 17);
		Shark Requin2 = new Shark("Nado", "Femelle", 300, 220, 17);
		
		Penguin Ping1 = new Penguin("Pain", "Male", 40, 70, 34);
		Penguin Ping2 = new Penguin("Gouin", "Femelle", 40, 70, 34);
		
		// -------------------------------------------------------------------------------
		
		Employee Phil = new Employee("Philippe", "Homme", 32);
		
		// -------------------------------------------------------------------------------
		
		Enclosure Land1 = new Enclosure("Enclo Terrestre 1", 180, 4, "Mauvais");
		Enclosure Land2 = new Enclosure("Enclo Terrestre 2", 120, 3, "Bon");
		Enclosure Land3 = new Enclosure("Enclo Terrestre 3", 220, 5, "Bon");
		Enclosure Land4 = new Enclosure("Enclo Terrestre 4", 90, 3, "Correct");
		
		Aquarium Aqua1 = new Aquarium("Aquarium 1", 350, 6, 40, false);
		Aquarium Aqua2 = new Aquarium("Aquarium 2", 280, 4, 30, true);
		Aquarium Aqua3 = new Aquarium("Aquarium 3", 180, 3, 30, true);
		
		Voliere Vol1 = new Voliere("Voliere 1", 640, 4, "Bon", 50);
		Voliere Vol2 = new Voliere("Voliere 1", 460, 4, "Bon", 30);
		
		// -------------------------------------------------------------------------------
		
		System.out.println(Ours1.GiveBirth());
		System.out.println(Ours2.GiveBirth());
		
		System.out.println(Loup1.GiveBirth());
		System.out.println(Loup2.GiveBirth());
		
		System.out.println(Aigle1.LayEgg());
		System.out.println(Aigle2.LayEgg());
		
		System.out.println(Poisson1.LayEgg());
		System.out.println(Poisson2.LayEgg());

		System.out.println(Baleine1.GiveBirth());
		System.out.println(Baleine2.GiveBirth());
	}

}
