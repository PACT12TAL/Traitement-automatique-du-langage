package methode1PPV;

import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) 
	{	
		// acquérir le point WAV
		//l'envoyer à l'API google
		//on recoit une phrase que l'on nomme parole
		
	String parole="vous auriez un pull d'une autre couleur";
	
	
	int[] T = new int[MethodeDeBase.N]; 
	// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser

	
	ArrayList<String> commande = MethodeDeBase.creerCommande(parole); 
	/** commande est la arraylist de mots de la phrase a analyser*/
	
	T = MethodeDeBase.TableauAnalyse(commande);
	
	int indiceCommande = MethodeDeBase.tableauLePlusProche(T);
	
	int indiceAction = MethodeDeBase.correspondanceClasseAction(indiceCommande);
	
	System.out.println(indiceCommande);
	System.out.println(indiceAction);
	System.out.println(MethodeDeBase.toutesLesPhrases.get(indiceCommande));
	

	}

	
}
