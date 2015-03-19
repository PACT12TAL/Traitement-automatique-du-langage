package methode1PPV;
import java.util.ArrayList;



public class MethodeDeBase 
{
	// toute la m�thode est impl�ment�e dans le meme classe
	// creer plusieurs classes pour chaque objet ici comme une classe base de donn�es, une classe tableau d'analyse... rend les transferts entre classes inutilement diffi

	
	protected final static int N = 43 ; /** = C.size */
		// valeur a changer. 
		// N est le nombre de lemmes ou de mots
	
	protected final static int M = 38 ; // valeur a changer.
	// M est le nombre de commandes vocales que l'on a dans la base de donnees
	
	public static String[] B = {"je","j'","on","aimerais","voudrais","veux","commence","commencer","quitter","ajouter","payer","r�gler","acc�der","enlever","retirer","retourner","voir","consulter","essayer","catalogue","panier","paiement","retour","ok","page","pr�c�dent","pr�c�dente","suivant","suivante","demander","changer","v�tement","couleur","taille","mod�le","disponible","coloris","T-shirt","polo","pull","chemise","veste","trois"};
		// B est un tableau de taille N qui contiendra les mots de notre base de donn�es 
	
	public static String[] C ; 
	
	public static void remplirTableauC () 
	{
		ArrayList<String> listeFinale = new ArrayList<String>();
		for ( String phrase : toutesLesPhrases)
		{
			ArrayList<String> mot = creerCommande(phrase);
			for(String motDeVoc : mot)
			{
				for(String motExistant : listeFinale)
				{
					if(!(motExistant.equals(motDeVoc)))
						listeFinale.add(motDeVoc);
				}
				
			}
		}
		C = new String[listeFinale.size()];
		for (int i=0 ; i < listeFinale.size() ; i++) 
			C[i] = listeFinale.get(i);	
	}
	
	public static void main(String[] args){
		new MethodeDeBase();
		System.out.println(MethodeDeBase.testMethode());
	}
	
	
	public static ArrayList<String> toutesLesPhrases= new ArrayList<String>();
		// private normalement mais pour y acc�der dans les classes de cr�ation de tableaudetableaux
	
	public MethodeDeBase()
	{
		// phrase pour les boutons de l'interface
		toutesLesPhrases.add("commencer");
		toutesLesPhrases.add("on commence");
		toutesLesPhrases.add("quitter");
		toutesLesPhrases.add("retour");
		toutesLesPhrases.add("page pr�c�dente");
		toutesLesPhrases.add("pr�c�dent");
		toutesLesPhrases.add("suivant");
		toutesLesPhrases.add("ok");
		toutesLesPhrases.add("trois");
		
		// phrase d'acc�s au catalogue 
		toutesLesPhrases.add("Acc�der au catalogue");
		toutesLesPhrases.add("Retourner au catalogue");
		toutesLesPhrases.add("Voir le catalogue");
		toutesLesPhrases.add("consulter le catalogue");
		toutesLesPhrases.add("J'aimerais acc�der au catalogue");
		toutesLesPhrases.add("J'aimerais retourner au catalogue");
		toutesLesPhrases.add("J'aimerais voir le catalogue");
		toutesLesPhrases.add("J'aimerais consulter le catalogue");
	
		
		//commande avec le panier
		toutesLesPhrases.add("Ajouter au panier");
		toutesLesPhrases.add("retirer du panier");
		toutesLesPhrases.add("enlever du panier");
		toutesLesPhrases.add("Acc�der au panier");
		toutesLesPhrases.add("Voir le panier");
		toutesLesPhrases.add("Consulter le panier");
		toutesLesPhrases.add("Payer");
		toutesLesPhrases.add("Payer le panier");
		toutesLesPhrases.add("R�gler ma commande");
		toutesLesPhrases.add("paiement");
		
		
		//commande pour visualiser un v�tement
		toutesLesPhrases.add("Demander un v�tement");
		toutesLesPhrases.add("Changer de v�tement");
		toutesLesPhrases.add("Changer la couleur");
		toutesLesPhrases.add("Changer la taille");
		toutesLesPhrases.add("Ce mod�le est-il disponible dans d�autres coloris?");
		toutesLesPhrases.add("essayer");
		toutesLesPhrases.add("essayer le v�tement");
		toutesLesPhrases.add("Changer la taille");
		toutesLesPhrases.add("pull");
		toutesLesPhrases.add("Changer de pull");
		toutesLesPhrases.add("essayer le pull");
	}
	
	
	private static int[][] tableauDeTableaux = {{0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0}};
	
	
	
	private static int[][] tableauDeTableau = new int[N][M];
	
	public static void remplirTableauDeTableau(){
		
			for (int j=0;j<toutesLesPhrases.size();j++){
			
				int[] T = TableauAnalyse(creerCommande(toutesLesPhrases.get(j)));
				tableauDeTableau[j]=T;
			
		}
	}
	
	public static boolean testMethode(){
		remplirTableauDeTableau();
		System.out.println(B[36]);
		for (int i=0;i<M;i++)
			for(int j=0;j<N;j++){
				if(tableauDeTableau[i][j]!=tableauDeTableaux[i][j]){
					System.out.println(""+i+" "+j);
				}
					
					
			}return true;
		
	}
			
			
	
	public String phrase;
		// phrase est la phrase a analyser en un seul string fourni par l'API google
	
	
	/* private ArrayList<String> commande= creerCommande(phrase); 
		/**  commande est la arraylist de mots de la phrase phrase*/

	
	public static ArrayList<String> creerCommande(String phrase)
	{
		ArrayList<String> liste = new ArrayList<String>();
		int longueur =phrase.length();
		String currentWord = "";
		for (int i=0;i<longueur;i++)
		{
			String caractere=phrase.substring(i, i+1).toLowerCase();
			if(caractere.equals(" ")){
				if(!(currentWord.equals(" "))){
				liste.add(currentWord);
				currentWord="";
				}
			}else if (caractere.equals("'")){
				currentWord+=caractere;
				liste.add(currentWord);
				currentWord="";
			}else{
				currentWord+=caractere;
			}
				
		}
		liste.add(currentWord);
		
		return liste;
	}



	
	public static void initT(int[] T)
	{
		//initialise les cases du tableau T a zero pour �viter les mauvaises surprises
		for (int i=0 ; i<N ; i++ )
			T[i] = 0;
	}
	
	public static int reconnaissanceMot(String mot)
	{
		// cette m�thode permet de savoir si un mot est dans la base de donnees B 
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
			// indice du tableau de la base de donn�es le plus proche du tableau tabl
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
