import java.util.ArrayList;


public class TableauAnalyse 
{	
	private int[] T = new int[BaseDeDonnees.getN()]; 
	private ArrayList<String> Commande =new ArrayList<String>();
	
	
	
	public void initT(int[] T)
	{
		for (int i=0 ; i<BaseDeDonnees.getN() ; i++ )
			T[i] = 0;
	}
	
	public void incrementationTableau(int i)
	{
		T[i] += 1;
	}
	
	public void decouperPhrase(String phrase)
	{
		// dŽcouper la phrase en mot et mettre les ots dans ka liste commande
	}
	
	public TableauAnalyse() 
	{
		initT(T);
		for (String mot: Commande)
			incrementationTableau(BaseDeDonnees.reconnaissanceMot(mot));	
	}
}
