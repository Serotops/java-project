package ZooNeuvot;

public interface Other 
{
	public default boolean CanLayEgg(Animal pAni)
	{
		boolean vRet = false;
		
		if(pAni.getSex() == "Femelle")
			vRet = true;
		
		return vRet;
	}
}
