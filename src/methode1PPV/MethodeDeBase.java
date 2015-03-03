package methode1PPV;
import java.util.ArrayList;



public class MethodeDeBase 
{
	// toute la méthode est implémentée dans le meme classe
	// creer plusieurs classes pour chaque objet ici comme une classe base de données, une classe tableau d'analyse... rend les transferts entre classes inutilement diffi

	
	protected final static int N = 42 ; // valeur a changer.
		// N est le nombre de lemmes ou de mots
	
	protected final static int M = 50 ; // valeur a changer.
	// M est le nombre de commandes vocales que l'on a dans la base de donnees
	
	public static String[] B = {"je","j'","on","aimerais","voudrais","veux","commence","commencer","quitter","ajouter","payer","régler","accéder","enlever","retirer","retourner","voir","consulter","essayer","catalogue","paiement","retour","ok","page","précédent","précédente","suivant","suivante","demander","changer","vêtement","couleur","taille","modèle","disponible","coloris","T-shirt","polo","pull","chemise","veste","trois"};
		// B est un tableau de taille N qui contiendra les mots de notre base de données 
	
	
	
	
	private ArrayList<String> toutesLesPhrases= new ArrayList<String>();
	
	public MethodeDeBase()
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
		toutesLesPhrases.add("Je voudrais accéder au catalogue");
		toutesLesPhrases.add("Je voudrais retourner au catalogue");
		toutesLesPhrases.add("Je voudrais voir le catalogue");
		toutesLesPhrases.add("Je voudrais consulter le catalogue");
		toutesLesPhrases.add("Je veux accéder au catalogue");
		toutesLesPhrases.add("Je veux retourner au catalogue");
		toutesLesPhrases.add("Je veux voir le catalogue");
		toutesLesPhrases.add("Je veux consulter le catalogue");
		toutesLesPhrases.add("Je souhaite accéder au catalogue");
		toutesLesPhrases.add("Je souhaite retourner au catalogue");
		toutesLesPhrases.add("Je souhaite voir le catalogue");
		toutesLesPhrases.add("Je souhaite consulter le catalogue");
		
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
	}
	
	
	private static int[][] tableauDeTableau = {{1,2,3},{0,0,4}};
	
	
	
	public String phrase;
		// phrase est la phrase a analyser en un seul string fourni par l'API google
		

	
	public static ArrayList<String> creerCommande(String phrase)
	{
		ArrayList<String> liste = new ArrayList<String>();
		int longueur =phrase.length();
		String currentWord = "";
		for (int i=0;i<longueur;i++){
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
		return liste;
	}

	
	private ArrayList<String> commande = creerCommande(phrase); 
		/**  commande est la arraylist de mots de la phrase phrase*/

	
	
	public static int reconnaissanceMot(String mot)
	{
		// cette méthode permet de savoir si un mot est dans la base de donnees B 
		// elle retourne le numero de la case dans laquelle est le lemme
		// si le mot n'est pas dans le mot renvoie N
		int i = 0;
		while (!mot.toLowerCase().equals(B[i].toLowerCase()) && i!=(N))
			i+=1;
		
		return i;
	}
	
	
	public static void initT(int[] T)
	{
		//initialise les cases du tableau T a zero pour éviter les mauvaises surprises
		for (int i=0 ; i<N ; i++ )
			T[i] = 0;
	}
	
	public static void incrementationTableau(int i, int[] tab)
	{
		if (i>=0 && i<N)
				tab[i] += 1;
	}
	
	
	public static int[] TableauAnalyse(ArrayList<String> phrase) 
	{
		 int[] tableau = new int[N];
		initT(tableau);
		for (String mot: phrase)
			incrementationTableau(reconnaissanceMot(mot),tableau);	
		return tableau;
	}

	
	public static double comparateurDeDeuxTableaux (int[] tab1, int[] tab2)
	{
		double normTab1 = 0;
		double normTab2 = 0;
		double ps = 0;
		
		int i;
		for (i=0 ; i<N ; i++)
			 normTab1 += ((tab1[i])^2);
		
		int j;
		for (j=0 ; j<N ; j++)
			 normTab2 += ((tab2[j])^2);
		
		int k;
		for (k=0 ; k<N ; k++)
			 ps += ((tab1[k])*(tab2[k]));
		
		return (ps/(Math.sqrt(normTab1*normTab2)));
			// renvoie le ps norme
	}
	
	public static int tableauLePlusProche(int[] tabl)
	{
		int i;
		int indicePlusProche; 
			// indice du tableau de la base de données le plus proche du tableau tabl
		double psPlusGrand = 0;
			//ps norme de tabl et du tableau le plus proche de tabl
		
		
		for (i=1 ; i<M ; i++)
			if ( psPlusGrand < comparateurDeDeuxTableaux(tabl , tableauDeTableau[i]) )
				psPlusGrand = comparateurDeDeuxTableaux(tabl, tableauDeTableau[i]) ;
				indicePlusProche = i ;
		
		return (indicePlusProche);
		
	}
	
	
}
