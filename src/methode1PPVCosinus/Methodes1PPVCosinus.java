package methode1PPVCosinus;
import java.util.ArrayList;


public class Methodes1PPVCosinus 
{
	// toute la méthode est implémentée dans le meme classe
	// creer plusieurs classes pour chaque objet ici comme une classe base de données, une classe tableau d'analyse... rend les transferts entre classes inutilement diffi

	public static String[] B ; 
	// B est un tableau de taille N qui contiendra les mots de notre base de données 

	protected static int N ;
		// valeur a changer. 
		// N est le nombre de lemmes ou de mots
	
	
	
	public static void remplirTableauB () 
	{
		ArrayList<String> listeFinale = new ArrayList<String>();
		listeFinale.add("panier");
		
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
	
	
	public Methodes1PPVCosinus()
	{
		// phrase pour les boutons de l'interface
		toutesLesPhrases.add("commencer");
		toutesLesPhrases.add("on commence");
		toutesLesPhrases.add("commençons");
		toutesLesPhrases.add("allons y");
		toutesLesPhrases.add("J'aimerais commencer");
		toutesLesPhrases.add("J'aimerais bien commencer");
		toutesLesPhrases.add("Je veux commencer");
		toutesLesPhrases.add("Je veux bien commencer");
		toutesLesPhrases.add("Je voudrais commencer");
		toutesLesPhrases.add("Je voudrais bien commencer");
		toutesLesPhrases.add("Je souhaite commencer");
		
		toutesLesPhrases.add("a propos");
		toutesLesPhrases.add("voir a propos");
		toutesLesPhrases.add("aller dans a propos");
		toutesLesPhrases.add("J'aimerais aller dans a propos");
		toutesLesPhrases.add("J'aimerais bien aller dans a propos");
		toutesLesPhrases.add("Je veux aller dans a propos");
		toutesLesPhrases.add("Je veux bien aller dans a propos");
		toutesLesPhrases.add("Je voudrais aller dans a propos");
		toutesLesPhrases.add("Je voudrais bien aller dans a propos");
		toutesLesPhrases.add("Je souhaite aller dans a propos");
		
		toutesLesPhrases.add("quitter");
		toutesLesPhrases.add("J'aimerais quitter");
		toutesLesPhrases.add("J'aimerais bien quitter");
		toutesLesPhrases.add("Je veux quitter");
		toutesLesPhrases.add("Je veux bien quitter");
		toutesLesPhrases.add("Je voudrais quitter");
		toutesLesPhrases.add("Je voudrais bien quitter");
		toutesLesPhrases.add("Je souhaite quitter");
		toutesLesPhrases.add("arrêter");
		toutesLesPhrases.add("J'aimerais arrêter");
		toutesLesPhrases.add("J'aimerais bien arrêter");
		toutesLesPhrases.add("Je veux arrêter");
		toutesLesPhrases.add("Je veux bien arrêter");
		toutesLesPhrases.add("Je voudrais arrêter");
		toutesLesPhrases.add("Je voudrais bien arrêter");
		toutesLesPhrases.add("Je souhaite arrêter");
		
		toutesLesPhrases.add("zéro");
		toutesLesPhrases.add("un");
		toutesLesPhrases.add("deux");
		toutesLesPhrases.add("trois");
		toutesLesPhrases.add("quatre");
		toutesLesPhrases.add("cinq");
		toutesLesPhrases.add("six");
		toutesLesPhrases.add("sept");
		toutesLesPhrases.add("huit");
		toutesLesPhrases.add("neuf");
		
		toutesLesPhrases.add("nouveau compte");
		toutesLesPhrases.add("créer un nouveau compte");
		toutesLesPhrases.add("J'aimerais créer un nouveau compte");
		toutesLesPhrases.add("J'aimerais bien créer un nouveau compte");
		toutesLesPhrases.add("Je veux créer un nouveau compter");
		toutesLesPhrases.add("Je veux bien créer un nouveau compte");
		toutesLesPhrases.add("Je voudrais créer un nouveau compte");
		toutesLesPhrases.add("Je voudrais bien créer un nouveau compte");
		toutesLesPhrases.add("Je souhaite créer un nouveau compte");
		
		toutesLesPhrases.add("ouvrir un nouveau compte");
		toutesLesPhrases.add("J'aimerais ouvrir un nouveau compte");
		toutesLesPhrases.add("J'aimerais bien ouvrir un nouveau compte");
		toutesLesPhrases.add("Je veux ouvrir un nouveau compter");
		toutesLesPhrases.add("Je veux bien ouvrir un nouveau compte");
		toutesLesPhrases.add("Je voudrais ouvrir un nouveau compte");
		toutesLesPhrases.add("Je voudrais bien ouvrir un nouveau compte");
		toutesLesPhrases.add("Je souhaite ouvrir un nouveau compte");
		
		toutesLesPhrases.add("supprimer compte");
		toutesLesPhrases.add("supprimer le compte");
		toutesLesPhrases.add("J'aimerais supprimer le compte");
		toutesLesPhrases.add("J'aimerais bien supprimer le compte");
		toutesLesPhrases.add("Je veux supprimer le compter");
		toutesLesPhrases.add("Je veux bien supprimer le compte");
		toutesLesPhrases.add("Je voudrais supprimer le compte");
		toutesLesPhrases.add("Je voudrais bien supprimer le compte");
		toutesLesPhrases.add("Je souhaite supprimer le compte");		
		
		
		toutesLesPhrases.add("a");
		toutesLesPhrases.add("z");
		toutesLesPhrases.add("e");
		toutesLesPhrases.add("r");
		toutesLesPhrases.add("t");
		toutesLesPhrases.add("y");
		toutesLesPhrases.add("u");
		toutesLesPhrases.add("i");
		toutesLesPhrases.add("o");
		toutesLesPhrases.add("p");
		toutesLesPhrases.add("q");
		toutesLesPhrases.add("s");
		toutesLesPhrases.add("d");
		toutesLesPhrases.add("f");
		toutesLesPhrases.add("g");
		toutesLesPhrases.add("h");
		toutesLesPhrases.add("j");
		toutesLesPhrases.add("k");
		toutesLesPhrases.add("l");
		toutesLesPhrases.add("m");
		toutesLesPhrases.add("w");
		toutesLesPhrases.add("x");
		toutesLesPhrases.add("c");
		toutesLesPhrases.add("v");
		toutesLesPhrases.add("b");
		toutesLesPhrases.add("n");
		toutesLesPhrases.add("espace");
		toutesLesPhrases.add("effacer");
		toutesLesPhrases.add("J'aimerais effacer");
		toutesLesPhrases.add("J'aimerais bien effacer");
		toutesLesPhrases.add("Je veux effacer");
		toutesLesPhrases.add("Je veux bien effacer");
		toutesLesPhrases.add("Je voudrais effacer");
		toutesLesPhrases.add("Je voudrais bien effacer");
		toutesLesPhrases.add("Je souhaite effacer");	
		
		toutesLesPhrases.add("retour");
		toutesLesPhrases.add("page précédente");
		toutesLesPhrases.add("revenir");
		toutesLesPhrases.add("revenir à la page précédente");
		toutesLesPhrases.add("J'aimerais revenir à la page précédente");
		toutesLesPhrases.add("J'aimerais bien revenir à la page précédente");
		toutesLesPhrases.add("Je veux revenir à la page précédente");
		toutesLesPhrases.add("Je veux bien revenir à la page précédente");
		toutesLesPhrases.add("Je voudrais revenir à la page précédente");
		toutesLesPhrases.add("Je voudrais bien revenir à la page précédente");
		toutesLesPhrases.add("Je souhaite revenir à la page précédente");
		
		
		
		toutesLesPhrases.add("précédent");
		toutesLesPhrases.add("vêtement précédent");
		toutesLesPhrases.add("voir le vêtement précédent");
		toutesLesPhrases.add("J'aimerais voir le vêtement précédent");
		toutesLesPhrases.add("J'aimerais bien voir le vêtement précédent");
		toutesLesPhrases.add("Je veux voir le vêtement précédent");
		toutesLesPhrases.add("Je veux bien voir le vêtement précédent");
		toutesLesPhrases.add("Je voudrais voir le vêtement précédent");
		toutesLesPhrases.add("Je voudrais bien voir le vêtement précédent");
		toutesLesPhrases.add("Je souhaite voir le vêtement précédent");
		
		toutesLesPhrases.add("suivant");
		toutesLesPhrases.add("vêtement suivant");
		toutesLesPhrases.add("voir le vêtement suivant");
		toutesLesPhrases.add("J'aimerais voir le vêtement suivant");
		toutesLesPhrases.add("J'aimerais bien voir le vêtement suivant");
		toutesLesPhrases.add("Je veux voir le vêtement suivant");
		toutesLesPhrases.add("Je veux bien voir le vêtement suivant");
		toutesLesPhrases.add("Je voudrais voir le vêtement suivant");
		toutesLesPhrases.add("Je voudrais bien voir le vêtement suivant");
		toutesLesPhrases.add("Je souhaite voir le vêtement suivant");
		
		toutesLesPhrases.add("ok");
		toutesLesPhrases.add("valider");
		toutesLesPhrases.add("oui");
		toutesLesPhrases.add("ouais");
		toutesLesPhrases.add("ouais ouais");
		toutesLesPhrases.add("non");
		toutesLesPhrases.add("non non");
		
		
	
		// phrase d'accès au catalogue 
		toutesLesPhrases.add("Accéder au catalogue");
		toutesLesPhrases.add("Retourner au catalogue");
		toutesLesPhrases.add("Voir le catalogue");
		toutesLesPhrases.add("consulter le catalogue");
		toutesLesPhrases.add("aller sur le catalogue");
		toutesLesPhrases.add("aller au catalogue");
		toutesLesPhrases.add("J'aimerais accéder au catalogue");
		toutesLesPhrases.add("J'aimerais retourner au catalogue");
		toutesLesPhrases.add("J'aimerais voir le catalogue");
		toutesLesPhrases.add("J'aimerais aller voir le catalogue");
		toutesLesPhrases.add("J'aimerais consulter le catalogue");
		toutesLesPhrases.add("Je voudrais accéder au catalogue");
		toutesLesPhrases.add("Je voudrais retourner au catalogue");
		toutesLesPhrases.add("Je voudrais voir le catalogue");
		toutesLesPhrases.add("Je voudrais aller voir le catalogue");
		toutesLesPhrases.add("Je voudrais consulter le catalogue");
		toutesLesPhrases.add("Je veux accéder au catalogue");
		toutesLesPhrases.add("Je veux retourner au catalogue");
		toutesLesPhrases.add("Je veux voir le catalogue");
		toutesLesPhrases.add("Je veux aller voir le catalogue");
		toutesLesPhrases.add("Je veux consulter le catalogue");
		toutesLesPhrases.add("Je souhaite accéder au catalogue");
		toutesLesPhrases.add("Je souhaite retourner au catalogue");
		toutesLesPhrases.add("Je souhaite voir le catalogue");
		toutesLesPhrases.add("Je souhaite aller voir le catalogue");
		toutesLesPhrases.add("Je souhaite consulter le catalogue");
		toutesLesPhrases.add("J'aimerais bien accéder au catalogue");
		toutesLesPhrases.add("J'aimerais bien retourner au catalogue");
		toutesLesPhrases.add("J'aimerais bien voir le catalogue");
		toutesLesPhrases.add("J'aimerais bien aller voir le catalogue");
		toutesLesPhrases.add("J'aimerais bien consulter le catalogue");
		toutesLesPhrases.add("Je voudrais bien accéder au catalogue");
		toutesLesPhrases.add("Je voudrais bien retourner au catalogue");
		toutesLesPhrases.add("Je voudrais bien voir le catalogue");
		toutesLesPhrases.add("Je voudrais bien aller voir le catalogue");
		toutesLesPhrases.add("Je voudrais bien consulter le catalogue");
		toutesLesPhrases.add("Je veux bien accéder au catalogue");
		toutesLesPhrases.add("Je veux bien retourner au catalogue");
		toutesLesPhrases.add("Je veux bien voir le catalogue");
		toutesLesPhrases.add("Je veux bien aller voir le catalogue");
		toutesLesPhrases.add("Je veux bien consulter le catalogue");
		
		toutesLesPhrases.add("quitter le catalogue");
		toutesLesPhrases.add("J'aimerais quitter le catalogue");
		toutesLesPhrases.add("J'aimerais bien quitter le catalogue");
		toutesLesPhrases.add("Je veux quitter le catalogue");
		toutesLesPhrases.add("Je veux bien quitter le catalogue");
		toutesLesPhrases.add("Je voudrais quitter le catalogue");
		toutesLesPhrases.add("Je voudrais bien quitter le catalogue");
		toutesLesPhrases.add("Je souhaite quitter le catalogue");

		
		//commande avec le panier
		toutesLesPhrases.add("Ajouter au panier");
		toutesLesPhrases.add("J'aimerais ajouter au panier");
		toutesLesPhrases.add("J'aimerais bien ajouter au panier");
		toutesLesPhrases.add("Je veux ajouter au panier");
		toutesLesPhrases.add("Je veux bien ajouter au panier");
		toutesLesPhrases.add("Je voudrais ajouter au panier");
		toutesLesPhrases.add("Je voudrais bien ajouter au panier");
		toutesLesPhrases.add("Je souhaite ajouter au panier");
		
		toutesLesPhrases.add("Rajouter au panier");
		toutesLesPhrases.add("J'aimerais rajouter au panier");
		toutesLesPhrases.add("J'aimerais bien rajouter au panier");
		toutesLesPhrases.add("Je veux consulter rajouter au panier");
		toutesLesPhrases.add("Je veux bien rajouter au panier");
		toutesLesPhrases.add("Je voudrais rajouter au panier");
		toutesLesPhrases.add("Je voudrais bien rajouter au panier");
		toutesLesPhrases.add("Je souhaite rajouter au panier");
		
		toutesLesPhrases.add("mettre dans le panier");
		toutesLesPhrases.add("J'aimerais mettre dans le panier");
		toutesLesPhrases.add("J'aimerais bien mettre dans le panier");
		toutesLesPhrases.add("Je veux consulter mettre dans le panier");
		toutesLesPhrases.add("Je veux bien mettre dans le panier");
		toutesLesPhrases.add("Je voudrais mettre dans le panier");
		toutesLesPhrases.add("Je voudrais bien mettre dans le panier");
		toutesLesPhrases.add("Je souhaite mettre dans le panier");
		
		toutesLesPhrases.add("Accéder au panier");
		toutesLesPhrases.add("J'aimerais accéder au panier");
		toutesLesPhrases.add("J'aimerais bien accéder au panier");
		toutesLesPhrases.add("Je veux consulter accéder au panier");
		toutesLesPhrases.add("Je veux bien accéder au panier");
		toutesLesPhrases.add("Je voudrais accéder au panier");
		toutesLesPhrases.add("Je voudrais bien accéder au panier");
		toutesLesPhrases.add("Je souhaite accéder au panier");
		
		toutesLesPhrases.add("Voir le panier");
		toutesLesPhrases.add("J'aimerais voir le panier");
		toutesLesPhrases.add("J'aimerais bien voir le panier");
		toutesLesPhrases.add("Je veux consulter voir le panier");
		toutesLesPhrases.add("Je veux bien voir le panier");
		toutesLesPhrases.add("Je voudrais voir le panier");
		toutesLesPhrases.add("Je voudrais bien voir le panier");
		toutesLesPhrases.add("Je souhaite voir le panier");
		toutesLesPhrases.add("J'aimerais aller voir le panier");
		toutesLesPhrases.add("J'aimerais bien aller voir le panier");
		toutesLesPhrases.add("Je veux aller voir le panier");
		toutesLesPhrases.add("Je veux bien aller voir le panier");
		toutesLesPhrases.add("Je voudrais aller voir le panier");
		toutesLesPhrases.add("Je voudrais bien aller voir le panier");
		toutesLesPhrases.add("Je souhaite aller voir le panier");
		
		toutesLesPhrases.add("Aller au panier");
		toutesLesPhrases.add("J'aimerais aller au panier");
		toutesLesPhrases.add("J'aimerais bien aller au panier");
		toutesLesPhrases.add("Je veux aller au panier");
		toutesLesPhrases.add("Je veux bien aller au panier");
		toutesLesPhrases.add("Je voudrais aller au panier");
		toutesLesPhrases.add("Je voudrais bien aller au panier");
		toutesLesPhrases.add("Je souhaite aller au panier");
		
		toutesLesPhrases.add("Consulter le panier");
		toutesLesPhrases.add("J'aimerais consulter le panier");
		toutesLesPhrases.add("J'aimerais bien consulter le panier");
		toutesLesPhrases.add("Je veux consulter le panier");
		toutesLesPhrases.add("Je veux bien consulter le panier");
		toutesLesPhrases.add("Je voudrais consulter le panier");
		toutesLesPhrases.add("Je voudrais bien consulter le panier");
		toutesLesPhrases.add("Je souhaite consulter le panier");
		
		toutesLesPhrases.add("retirer du panier");
		toutesLesPhrases.add("J'aimerais retirer du panier");
		toutesLesPhrases.add("J'aimerais bien retirer du panier");
		toutesLesPhrases.add("Je veux consulter retirer du panier");
		toutesLesPhrases.add("Je veux bien retirer du panier");
		toutesLesPhrases.add("Je voudrais retirer du panier");
		toutesLesPhrases.add("Je voudrais bien retirer du panier");
		toutesLesPhrases.add("Je souhaite retirer du panier");
		
		toutesLesPhrases.add("enlever du panier");
		toutesLesPhrases.add("J'aimerais enlever du panier");
		toutesLesPhrases.add("J'aimerais bien enlever du panier");
		toutesLesPhrases.add("Je veux consulter enlever du panier");
		toutesLesPhrases.add("Je veux bien enlever du panier");
		toutesLesPhrases.add("Je voudrais enlever du panier");
		toutesLesPhrases.add("Je voudrais bien enlever du panier");
		toutesLesPhrases.add("Je souhaite enlever du panier");
		
		toutesLesPhrases.add("supprimer du panier");
		toutesLesPhrases.add("J'aimerais supprimer du panier");
		toutesLesPhrases.add("J'aimerais bien supprimer du panier");
		toutesLesPhrases.add("Je veux consulter supprimer du panier");
		toutesLesPhrases.add("Je veux bien supprimer du panier");
		toutesLesPhrases.add("Je voudrais supprimer du panier");
		toutesLesPhrases.add("Je voudrais bien supprimer du panier");
		toutesLesPhrases.add("Je souhaite supprimer du panier");
		
		// toutesLesPhrases.add("Payer"); 			L'interface graphique ne prend pas en compte le paiement
		// toutesLesPhrases.add("Payer le panier");
		// toutesLesPhrases.add("Régler ma commande");
		// toutesLesPhrases.add("paiement");
		
		
		//commande pour visualiser un vêtement
		
		toutesLesPhrases.add("pull");
		toutesLesPhrases.add("robe");
		toutesLesPhrases.add("tee shirt");
		toutesLesPhrases.add("pantalon ");
		
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
		
		// toutesLesPhrases.add("Demander un vêtement");       la commande n'est plus utile car on oriente le projet pour des particuliers
		
		
		
		
		M = toutesLesPhrases.size();
			// M est le nombre de commandes vocales que l'on a dans la base de donnees
		
		
		remplirTableauB() ;
		tableauDeTableaux = new int[N][M];
		remplirTableauDeTableaux() ;
		
	}
	
	
	private static int[][] tableauDeTableaux ;
	
	public static void remplirTableauDeTableaux()
	{
		for (int j=0;j<toutesLesPhrases.size();j++)
			{
				int[] T = TableauAnalyse(creerCommande(toutesLesPhrases.get(j)));
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
			else if (caractere.equals("-"))
			{
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


	
	public static void initT(int[] T)
	{
		//initialise les cases du tableau T a zero pour éviter les mauvaises surprises
		for (int i=0 ; i<N ; i++ )
			T[i] = 0;
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

	
	public static void incrementationTableau(int i, int[] tab)
	{
		if (i>=0 && i<N)
				tab[i] += 1;
	}
	
	
	public static int[] TableauAnalyse(ArrayList<String> commande) 
	{
		 int[] tableau = new int[N];
		initT(tableau);
		for (String mot: commande)
			incrementationTableau(reconnaissanceMot(mot),tableau);	
		return tableau;
	}

	
	public static double comparateurDeDeuxTableaux (int[] tab1, int[] tab2)
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
		
		return ((ps+0.0)/(Math.sqrt(normTab1*normTab2)));
			// renvoie le ps norme
	}
	
	
	public static int tableauLePlusProche(int[] tabl)
	{
		int i;
		int indicePlusProche=0; 
			// indice du tableau de la base de données le plus proche du tableau tabl
		double psPlusGrand;
			//ps norme de tabl et du tableau le plus proche de tabl
		psPlusGrand = comparateurDeDeuxTableaux(tabl , tableauDeTableaux[0]);
		
		for (i=1 ; i<M ; i++)
			if (psPlusGrand < comparateurDeDeuxTableaux(tabl , tableauDeTableaux[i]) )
			{
				psPlusGrand = comparateurDeDeuxTableaux(tabl, tableauDeTableaux[i]); 
				indicePlusProche = i ;
			}	
		
		return (indicePlusProche);
		
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
