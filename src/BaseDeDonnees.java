
public class BaseDeDonnees 
{
	private static int N;
	private static String[] B = new String[N];
	
	public static int getN()
	{
		return N;
	}
	
	public static int reconnaissanceMot(String mot)
	{
		int i = 0;
		while (!mot.equals(B[i]) && i!=(N+1))
			i+=1;
		
		return i;
	}
		
	
	
	
}

