package methode1PPV;
import java.util.ArrayList;


public class MethodeDes1PlusProcheVoisin 
{
	// toute la méthode est implémentée dans le meme classe
	// creer plusieurs classes pour chaque objet ici comme une classe base de données, une classe tableau d'analyse... rend les transferts entre classes inutilement diffi

	
	private static int N; 
		// N est le nombre de lemmes
	
	private static String[] B = new String[N];
		// B est un tableau de taille N  
	
	private int[] T = new int[N]; 
		// T est le tableau d'analyse du mot
	
	private ArrayList<String> Commande =new ArrayList<String>(); /**  commande est la liste de mots lemmatisés*/
	
	
	public static int reconnaissanceMot(String mot)
	{
		// cette méthode permet de savoir si un lemme est dans la base de donnees B 
		// elle retourne le numero de la case dans laquelle est le lemme
		// si le lemme n'est pas dans le mot renvoie N+1
		int i = 0;
		while (!mot.equals(B[i]) && i!=(N+1))
			i+=1;
		
		return i;
	}
	
	
	public void initT(int[] T)
	{
		//initialise les cases du tableau T a zero pour éviter les mauvaises surprises
		for (int i=0 ; i<N ; i++ )
			T[i] = 0;
	}
	
	public void incrementationTableau(int i)
	{
		T[i] += 1;
	}
	
	
	public void TableauAnalyse() 
	{
		initT(T);
		for (String mot: Commande)
			incrementationTableau(reconnaissanceMot(mot));	
	}

	
	public void decouperPhrase(String phrase)
	{
		// découper la phrase en mot et mettre les ots dans ka liste commande
	}
	
	
	
}
