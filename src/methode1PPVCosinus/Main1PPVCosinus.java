package methode1PPVCosinus;

import java.util.ArrayList;


public class Main1PPVCosinus {
	
	public static void main(String[] args) 
	{	
		// acquérir le point WAV
		//l'envoyer à l'API google
		//on recoit une phrase que l'on nomme parole
		
	String parole="vous auriez un pull d'une autre couleur";
	
	
	int[] T = new int[Methodes1PPVCosinus.N]; 
	// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser

	
	ArrayList<String> commande = Methodes1PPVCosinus.creerCommande(parole); 
	/** commande est la arraylist de mots de la phrase a analyser*/
	
	T = Methodes1PPVCosinus.TableauAnalyse(commande);
	
	int indiceCommande = Methodes1PPVCosinus.tableauLePlusProche(T);
	
	int indiceAction = Methodes1PPVCosinus.correspondanceClasseAction(indiceCommande);
	
	System.out.println(indiceCommande);
	System.out.println(indiceAction);
	System.out.println(Methodes1PPVCosinus.toutesLesPhrases.get(indiceCommande));
	

	}

	
}
