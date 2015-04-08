package methode1PPVTFIDF;

import java.util.ArrayList;

import methode1PPVCosinus.Methodes1PPVCosinus;


public class Main1PPVTFIDF {

	public static void main(String[] args) 
	{

		// acquérir le point WAV
		//l'envoyer à l'API google
		//on recoit une phrase que l'on nomme parole

		
		new Methodes1PPVTFIDF();
		
		String parole="je voudrais commencer";
		
		
		double[] T = new double[Methodes1PPVTFIDF.N]; 
		// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser

		
		ArrayList<String> commande = Methodes1PPVTFIDF.creerCommande(parole); 
		/** commande est la arraylist de mots de la phrase a analyser*/
		
		T = Methodes1PPVTFIDF.TableauAnalyse(commande);
		
		int indiceCommande = Methodes1PPVTFIDF.tableauLePlusProche(T);
		
		int indiceAction = Methodes1PPVTFIDF.correspondanceClasseAction(indiceCommande);
		
		System.out.println(indiceCommande);
		System.out.println(indiceAction); // indice a recuperer pour l'intégration
		System.out.println(Methodes1PPVCosinus.toutesLesPhrases.get(indiceCommande));
	}

}
