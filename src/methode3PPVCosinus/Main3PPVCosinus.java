package methode3PPVCosinus;

import java.util.ArrayList;



public class Main3PPVCosinus {
	
	public static void main(String[] args) 
	{	
		
		// acquérir le point WAV
		//l'envoyer à l'API google
		//on recoit une phrase que l'on nomme parole
	
		new Methodes3PPVCosinus();
	
		
	String parole="essayer le pull";
	
	
	int[] T = new int[Methodes3PPVCosinus.N]; 
	// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser

	
	ArrayList<String> commande = Methodes3PPVCosinus.creerCommande(parole); 
	/** commande est la arraylist de mots de la phrase a analyser*/
	
	T = Methodes3PPVCosinus.TableauAnalyse(commande);
	
	int indiceAction = Methodes3PPVCosinus.commandeLaPlusProbable(T);
		
	System.out.println(indiceAction);
	

	}

	
}
