package methode3PPVTFIDF;

import java.util.ArrayList;

public class Methodes3PPVTFIDF 
{
	// toute la méthode est implémentée dans le meme classe
	// creer plusieurs classes pour chaque objet ici comme une classe base de données, une classe tableau d'analyse... rend les transferts entre classes inutilement diffi

	public static String[] B ; 
	// B est un tableau de taille N qui contiendra les mots de notre base de données 

	protected static int N ;
		// N est le nombre de lemmes ou de mots
	

	
	public static void remplirTableauB () 
	{
		ArrayList<String> listeFinale = new ArrayList<String>();
		listeFinale.add("je");
		
		for ( String phrase : toutesLesPhrases)
		{
			ArrayList<String> mot = creerCommande(phrase);
			
			for(String motDeVoc : mot)
			{
				boolean testappartenance = false;
				for(String motExistant : listeFinale)
				{
					if((motExistant.equals(motDeVoc)))
						testappartenance = true ;
				}
				if (!testappartenance) 
					listeFinale.add(motDeVoc);
			}
		}
		B = new String[listeFinale.size()];
		for (int i=0 ; i < listeFinale.size() ; i++) 
			B[i] = listeFinale.get(i);
		
		N = B.length ;
		
	}
	
	
	
	public static ArrayList<String> toutesLesPhrases= new ArrayList<String>();
		// private normalement mais pour y accéder dans les classes de création de tableaudetableaux
	
	protected static int M ;
		// M est le nombre de commandes vocales que l'on a dans la base de donnees
	
	
	public Methodes3PPVTFIDF()
	{
		// phrase pour les boutons de l'interface
		toutesLesPhrases.add("commencer");
		toutesLesPhrases.add("on commence");
		toutesLesPhrases.add("quitter");
		toutesLesPhrases.add("retour");
		toutesLesPhrases.add("page précédente");
		toutesLesPhrases.add("précédent");
		toutesLesPhrases.add("suivant");
		toutesLesPhrases.add("ok");
		toutesLesPhrases.add("trois");
		
		// phrase d'accès au catalogue 
		toutesLesPhrases.add("Accéder au catalogue");
		toutesLesPhrases.add("Retourner au catalogue");
		toutesLesPhrases.add("Voir le catalogue");
		toutesLesPhrases.add("consulter le catalogue");
		toutesLesPhrases.add("J'aimerais accéder au catalogue");
		toutesLesPhrases.add("J'aimerais retourner au catalogue");
		toutesLesPhrases.add("J'aimerais voir le catalogue");
		toutesLesPhrases.add("J'aimerais consulter le catalogue");
	
		
		//commande avec le panier
		toutesLesPhrases.add("Ajouter au panier");
		toutesLesPhrases.add("retirer du panier");
		toutesLesPhrases.add("enlever du panier");
		toutesLesPhrases.add("Accéder au panier");
		toutesLesPhrases.add("Voir le panier");
		toutesLesPhrases.add("Consulter le panier");
		toutesLesPhrases.add("Payer");
		toutesLesPhrases.add("Payer le panier");
		toutesLesPhrases.add("Régler ma commande");
		toutesLesPhrases.add("paiement");
		
		
		//commande pour visualiser un vêtement
		toutesLesPhrases.add("Demander un vêtement");
		toutesLesPhrases.add("Changer de vêtement");
		toutesLesPhrases.add("Changer la couleur");
		toutesLesPhrases.add("Changer la taille");
		toutesLesPhrases.add("Ce modèle est-il disponible dans d’autres coloris?");
		toutesLesPhrases.add("essayer");
		toutesLesPhrases.add("essayer le vêtement");
		toutesLesPhrases.add("Changer la taille");
		toutesLesPhrases.add("pull");
		toutesLesPhrases.add("Changer de pull");
		toutesLesPhrases.add("essayer le pull");
		
		

		M = toutesLesPhrases.size() ;
			// M est le nombre de commandes vocales que l'on a dans la base de donnees
		
		
		remplirTableauB() ;
		DF = new int [N] ;
		remplirDF();
		tableauDeTableaux = new double[N][M];
		remplirTableauDeTableaux() ;
		
	}
	
	

	private static int[] DF ;
	
	public static void remplirDF()
	{
		for(String commande : toutesLesPhrases)
		{
			boolean[] DFB = new boolean [N] ;
			ArrayList<String> mots = creerCommande(commande);
			for (int j=0 ; j<mots.size() ; j++)
			{
				for(int i=0 ; i<N ; i++)
				{
					if(B[i].toLowerCase().equals(mots.get(j).toLowerCase())) 
						{
						DFB[i]=true;
						break;
						}
				}	
			}
			for(int i=0 ; i<N ; i++) 
			{
				if(DFB[i]) DF[i]+=1;
			}
		}
	}
	
	 
	
	private static double[][] tableauDeTableaux ;
	
	public static void remplirTableauDeTableaux()
	{
		for (int j=0;j<toutesLesPhrases.size();j++)
			{
				double [] U = TableauAnalyse(creerCommande(toutesLesPhrases.get(j)));
					// la méthode TableauAnalyse code la partie term frequency
				double[] T = new double [N] ;
				for ( int i=0 ; i<N ; i++ )
					T[i] = (U[i]* Math.log(2*N / DF[i])) ;

				tableauDeTableaux[j]=T;
			}
	}
			
	
	
	public static ArrayList<String> creerCommande(String phrase)
	{
		ArrayList<String> liste = new ArrayList<String>();
		int longueur =phrase.length();
		String currentWord = "";
		for (int i=0 ; i<longueur ; i++)
		{
			String caractere=phrase.substring(i , i+1).toLowerCase();
			if(caractere.equals(" "))
			{
				if(!(currentWord.equals(" ")))
				{
				liste.add(currentWord);
				currentWord="";
				}
			}
			else if (caractere.equals("'"))
			{
				currentWord+=caractere;
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals("."))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals("!"))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals("?"))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals(";"))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals(","))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else if (caractere.equals(":"))
			{
				liste.add(currentWord);
				currentWord="";
			}
			else
			{
				currentWord+=caractere;
			}
				
		}
		if ( !currentWord.equals("") )
			liste.add(currentWord);
		
		return liste;
	}


	
	public static void initT(double[] tableau)
	{
		//initialise les cases du tableau T a zero pour éviter les mauvaises surprises
		for (int i=0 ; i<N ; i++ )
			tableau[i] = 0;
	}
	
	
	public static int reconnaissanceMot(String mot)
	{
		// cette méthode permet de savoir si un mot est dans la base de donnees B 
		// elle retourne le numero de la case dans laquelle est le lemme
		// si le mot n'est pas dans le mot renvoie N
		int i = 0;
		while (!mot.toLowerCase().equals(B[i].toLowerCase()) && i!=(N-1))
			i+=1;
		
		if( i==(N-1) )
			i= (!mot.toLowerCase().equals(B[i].toLowerCase()))? N : (N-1) ;
		
		return i;
	}
	
	
	public static void incrementationTableau(int i, double[] tab)
	{
		if (i>=0 && i<N)
				tab[i] += 1;
	}
	
	
	public static double[] TableauAnalyse(ArrayList<String> commande) 
	{
		 double[] tableau = new double[N];
		initT(tableau);
		for (String mot: commande)
			incrementationTableau(reconnaissanceMot(mot),tableau);	
		return tableau;
	}
	
	
	
	public static double comparateurDeDeuxTableaux (double[] tab1, double[] tab2)
	{
		double normTab1 = 0;
		double normTab2 = 0;
		double ps = 0;
		
		int i;
		for (i=0 ; i<tab1.length ; i++)
			 normTab1 += ((tab1[i])*(tab1[i]));
		
		int j;
		for (j=0 ; j<tab2.length ; j++)
			 normTab2 += ((tab2[j])*(tab2[j]));
		
		int k;
		for (k=0 ; k<N ; k++)
			 ps += ((tab1[k])*(tab2[k]));
		
		return ((ps)/(Math.sqrt(normTab1*normTab2)));
			// renvoie le ps norme
	}
	
	
	public static int commandeLaPlusProbable(double[] tabl)
	{
		int i;
		int indicePlusProche1=0;
		int indicePlusProche2=1;
		int indicePlusProche3=2;
		int indiceCommande1 ;
		int indiceCommande2 ;
		int indiceCommande3 ;
		int indicePlusProbable = 0;
			// les trois indices du tableau de la base de données les plus proches du tableaux tabl
		double psPlusGrand1;
		double psPlusGrand2;
		double psPlusGrand3;
			//ps normes de tabl et des tableaux les plus proches de tabl
		psPlusGrand1 = comparateurDeDeuxTableaux(tabl , tableauDeTableaux[0]);
		psPlusGrand2 = comparateurDeDeuxTableaux(tabl , tableauDeTableaux[1]);
		psPlusGrand3 = comparateurDeDeuxTableaux(tabl , tableauDeTableaux[2]);
		// on suppose que les trois premiers sont dans l'ordre
		
		
		/** on classe 0 et 1 */
		if (psPlusGrand1 < psPlusGrand2 )
		{
			psPlusGrand1 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[1]); 
			psPlusGrand2 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[0]); 
			indicePlusProche1 = 1 ;
			indicePlusProche2 = 0 ;
		}
		
		/** on classe 2 par rapport à 0 et 1 */
		if (psPlusGrand2 < psPlusGrand3 )
		{
			if(psPlusGrand1 < psPlusGrand3 )
			{
				psPlusGrand3 = psPlusGrand2;
				psPlusGrand2 = psPlusGrand1;
				psPlusGrand1 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[2]); 
				indicePlusProche3 = indicePlusProche2 ;
				indicePlusProche2 = indicePlusProche1 ;
				indicePlusProche1 = 2 ;
			}
			else 
			{
				psPlusGrand3 = psPlusGrand2; 
				psPlusGrand2 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[2]); 
				indicePlusProche3 = indicePlusProche2 ;
				indicePlusProche2 = 2 ;
			}
			
		}
		
			
			
		for (i=1 ; i<M ; i++)
			if (psPlusGrand3 < comparateurDeDeuxTableaux(tabl , tableauDeTableaux[i]) )
			{
				if(psPlusGrand2 < comparateurDeDeuxTableaux(tabl , tableauDeTableaux[i]) )
				{
					if(psPlusGrand1 < comparateurDeDeuxTableaux(tabl , tableauDeTableaux[i]) )
					{
						psPlusGrand3 = psPlusGrand2;
						psPlusGrand2 = psPlusGrand1;
						psPlusGrand1 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[i]); 
						indicePlusProche3 = indicePlusProche2 ;
						indicePlusProche2 = indicePlusProche1 ;
						indicePlusProche1 = i ;
					}
					else 
					{
						psPlusGrand3 = psPlusGrand2; 
						psPlusGrand2 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[i]); 
						indicePlusProche3 = indicePlusProche2 ;
						indicePlusProche2 = i ;
					}
				
				}
				else 
				{
					psPlusGrand3 = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[i]); 
					indicePlusProche3 = i ;
				}
			}	
		
		
		indiceCommande1 = correspondanceClasseAction(indicePlusProche1) ;
		indiceCommande2 = correspondanceClasseAction(indicePlusProche2) ;
		indiceCommande3 = correspondanceClasseAction(indicePlusProche3) ;
		
		
		indicePlusProbable = indiceCommande1 ;
			//commande par défaut
		if (indiceCommande2==indiceCommande3 ) // alors on choisit la commande 2 = commande 3
		{
			indicePlusProbable = indiceCommande2;
		}
		
		return (indicePlusProbable);
		
	}
	
	
	
	public static int correspondanceClasseAction(int indice)
	{
		int indiceClasseAction;
		
		switch(indice)
		{
		case 0 :
			indiceClasseAction = 0;
		break;
		
		case 1 :
			indiceClasseAction = 0;
		break;
		
		case 3 :
			indiceClasseAction = 10;
		break;
		
		case 2 :
			indiceClasseAction = 2;
		break;
		
		case 8 :
			indiceClasseAction = 5;
		break;
		
		case 7 :
			indiceClasseAction = 22;
		break;
		
		case 6 :
			indiceClasseAction = 17;
		break;
		
		case 35 :
			indiceClasseAction = 13;
		break;
		
		case 32 :
			indiceClasseAction = 20;
		break;
		
		case 33 :
			indiceClasseAction = 20;
		break;
		
		case 37 :
			indiceClasseAction = 20;
		break;		
		
		default :
			indiceClasseAction = -1;
			
		
		
		}
		
		return (indiceClasseAction);
				
	}
}

