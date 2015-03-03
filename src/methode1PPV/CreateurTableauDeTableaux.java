package methode1PPV;

import java.util.ArrayList;

public class CreateurTableauDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String parole="Accéder au panier";
		
		
		int[] T = new int[MethodeDeBase.N]; 
		// T est le tableau d'analyse du mot qui contiendra les nombres d'occurences des mots de la phrase a analyser

		
		ArrayList<String> commande = MethodeDeBase.creerCommande(parole); 
		/** commande est la arraylist de mots de la phrase a analyser*/
		
		T = MethodeDeBase.TableauAnalyse(commande);
		
		
		System.out.println(T);
		

	}

}
