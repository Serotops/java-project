package ZooNeuvot;

public interface Mammifere 
{
	public default boolean CanGiveBirth(Animal pAni)
	{
		boolean vRet = false;
		
		if(pAni.getSex() == "Femelle")
			vRet = true;
		
		return vRet;
	}
}
