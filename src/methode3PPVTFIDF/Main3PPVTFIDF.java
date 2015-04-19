package methode3PPVTFIDF;

import java.util.ArrayList;

public class Main3PPVTFIDF {

	public static void main(String[] args) 
{	
		
		// acquérir le point WAV
		//l'envoyer à l'API google
		//on recoit une phrase que l'on nomme parole
	
		new Methodes3PPVTFIDF();
	
		
		String parole=" changer de vêtement";
	
	
		double[] T = new double[Methodes3PPVTFIDF.N]; 
			// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser
		
		ArrayList<String> commande = Methodes3PPVTFIDF.creerCommande(parole); 
			/** commande est la arraylist de mots de la phrase a analyser*/
			
		T = Methodes3PPVTFIDF.ConversionTableauTFIDF(Methodes3PPVTFIDF.TableauAnalyse(commande));

	
		int indiceAction = Methodes3PPVTFIDF.commandeLaPlusProbable(T);
		
		System.out.println(indiceAction);

	}

}
