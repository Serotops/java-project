package ZooNeuvot;

public class Tool 
{
	public static boolean CheckSexe(int pSexe)
	{
		boolean vRet = false;
		
		if(pSexe == 1 || pSexe == 2)
		{
			vRet = true; 
			System.out.println("Debug"); 
			System.out.println(vRet);
		}
		
		System.out.println("La putaon de sa grosse mre la pute la");
		return vRet;
	}
	
	public static String Civ(String pSexe)
	{
		String vRet = "Monsieur";
		
		if(pSexe == "Femme")
			vRet = "Madame";
		
		return vRet;
	}
}
