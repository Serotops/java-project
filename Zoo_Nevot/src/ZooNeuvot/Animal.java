package ZooNeuvot;

import java.util.Random;

public abstract class Animal 
{
	private String name;				// Nom de l'espèce
	private String sex;					// Sexe "Male" ou "Femelle"
	private double weight;				// Poids en g
	private double size;				// Taille en cm
	private int age;					// Age de l'animal
	private boolean hungerIndicator; 	// Indicateur de faim - true (a faim) false (n'a pas faim)
	private boolean sleepingIndicator; 	// Indicateur de sommeil - true (il dort) false (il ne dort pas)
	private boolean healthIndicator; 	// Indicateur de santé - true (en bonne santé) false (en mauvaise santé)

	
	/* Constructeurs */ 
	
	public Animal(String name ,String sex, double weight, double size, int age) 
	{
		this.sex = sex;
		this.weight = weight;
		this.size = size;
		this.age = age;
		this.hungerIndicator = true;
		this.sleepingIndicator = false;
		this.healthIndicator = false;
	}
	
	public Animal(String name, String sex, double weight, double size) 
	{
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.size = size;
	}

	/* Methodes */
	
	public String toSleep()
	{
		String vRet = "L'animal dort deja";
		
		if(!this.sleepingIndicator)
		{
			this.sleepingIndicator = true;
			vRet = "Animal endormi";
		}
		return vRet;
	}
	
	public String WakingUp() 
	{
		String vRet = "L'animal est déja réveillé";
		
		if(this.sleepingIndicator)
		{
			this.sleepingIndicator = false;
			vRet = "Animal réveillé";
		}
		return vRet;
	}

	// Retourn vrai si l'animal peut etre nourri
	public boolean beFed() 
	{
		boolean vRet = false;
		
		if((this.hungerIndicator) && (!this.sleepingIndicator))
			vRet = true;
		
		return vRet;
	}
	
	@Override
	public String toString() 
	{	
		return this.name + " " + this.sex + " de poids : " + this.weight + ", de taille : " + this.size + " est agé de " + this.age + " an(s). A faim : " 
			+ this.hungerIndicator + ", se repose : " + this.sleepingIndicator + ", est en bonne santé : " + this.healthIndicator;
	}
	
	public String MakingNoise()
	{
		return "Son de l'animal";
	}
	
	public String Move()
	{
		return "Déplacement de l'animal";
	}
	
	public boolean beNurse()
	{
		boolean vRet = false;
				
		if(!this.healthIndicator)
			vRet = true;
				
		return vRet;
	}
	
	public String RandomSex()
	{
		String vRet;
		
		Random r = new Random();
		int nb = r.nextInt(2);
		
		if(nb == 0)
			vRet = "Male";
		else
			vRet = "Femelle";
		
		return vRet;
	}
	
	public double RandomWeight()
	{
		return this.getRandomNumberInRange(400,6000);
	}
	
	public double RandomSize()
	{
		return this.getRandomNumberInRange(80,100);
	}
	
    private int getRandomNumberInRange(int min, int max) 
    {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
	
	/* Accesseurs */

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSex() 
	{
		return sex;
	}

	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	public double getSize() 
	{
		return size;
	}

	public void setSize(double size) 
	{
		this.size = size;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public boolean isHungerIndicator() 
	{
		return hungerIndicator;
	}

	public void setHungerIndicator(boolean hungerIndicator) 
	{
		this.hungerIndicator = hungerIndicator;
	}

	public boolean isSleepingIndicator() 
	{
		return sleepingIndicator;
	}

	public void setSleepingIndicator(boolean sleepingIndicator) 
	{
		this.sleepingIndicator = sleepingIndicator;
	}

	public boolean isHealthIndicator() 
	{
		return healthIndicator;
	}

	public void setHealthIndicator(boolean healthIndicator) 
	{
		this.healthIndicator = healthIndicator;
	}
}
