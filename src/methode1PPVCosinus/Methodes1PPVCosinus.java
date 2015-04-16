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
				/**  phrase pour les boutons de l'interface  */
		
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
		
		
	
				/** phrase d'accès au catalogue  */
		
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

		
				/**commande avec le panier  */
				 
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
		toutesLesPhrases.add("Je veux rajouter au panier");
		toutesLesPhrases.add("Je veux bien rajouter au panier");
		toutesLesPhrases.add("Je voudrais rajouter au panier");
		toutesLesPhrases.add("Je voudrais bien rajouter au panier");
		toutesLesPhrases.add("Je souhaite rajouter au panier");
		
		toutesLesPhrases.add("mettre dans le panier");
		toutesLesPhrases.add("J'aimerais mettre dans le panier");
		toutesLesPhrases.add("J'aimerais bien mettre dans le panier");
		toutesLesPhrases.add("Je veux mettre dans le panier");
		toutesLesPhrases.add("Je veux bien mettre dans le panier");
		toutesLesPhrases.add("Je voudrais mettre dans le panier");
		toutesLesPhrases.add("Je voudrais bien mettre dans le panier");
		toutesLesPhrases.add("Je souhaite mettre dans le panier");
		
		toutesLesPhrases.add("Accéder au panier");
		toutesLesPhrases.add("J'aimerais accéder au panier");
		toutesLesPhrases.add("J'aimerais bien accéder au panier");
		toutesLesPhrases.add("Je veux accéder au panier");
		toutesLesPhrases.add("Je veux bien accéder au panier");
		toutesLesPhrases.add("Je voudrais accéder au panier");
		toutesLesPhrases.add("Je voudrais bien accéder au panier");
		toutesLesPhrases.add("Je souhaite accéder au panier");
		
		toutesLesPhrases.add("Voir le panier");
		toutesLesPhrases.add("J'aimerais voir le panier");
		toutesLesPhrases.add("J'aimerais bien voir le panier");
		toutesLesPhrases.add("Je veux voir le panier");
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
		toutesLesPhrases.add("Je veux retirer du panier");
		toutesLesPhrases.add("Je veux bien retirer du panier");
		toutesLesPhrases.add("Je voudrais retirer du panier");
		toutesLesPhrases.add("Je voudrais bien retirer du panier");
		toutesLesPhrases.add("Je souhaite retirer du panier");
		
		toutesLesPhrases.add("enlever du panier");
		toutesLesPhrases.add("J'aimerais enlever du panier");
		toutesLesPhrases.add("J'aimerais bien enlever du panier");
		toutesLesPhrases.add("Je veux enlever du panier");
		toutesLesPhrases.add("Je veux bien enlever du panier");
		toutesLesPhrases.add("Je voudrais enlever du panier");
		toutesLesPhrases.add("Je voudrais bien enlever du panier");
		toutesLesPhrases.add("Je souhaite enlever du panier");
		
		toutesLesPhrases.add("supprimer du panier");
		toutesLesPhrases.add("J'aimerais supprimer du panier");
		toutesLesPhrases.add("J'aimerais bien supprimer du panier");
		toutesLesPhrases.add("Je veux supprimer du panier");
		toutesLesPhrases.add("Je veux bien supprimer du panier");
		toutesLesPhrases.add("Je voudrais supprimer du panier");
		toutesLesPhrases.add("Je voudrais bien supprimer du panier");
		toutesLesPhrases.add("Je souhaite supprimer du panier");
		
		// toutesLesPhrases.add("Payer"); 			L'interface graphique ne prend pas en compte le paiement
		// toutesLesPhrases.add("Payer le panier");
		// toutesLesPhrases.add("Régler ma commande");
		// toutesLesPhrases.add("paiement");
		
		
				/**commande pour visualiser un vêtement */
		
		toutesLesPhrases.add("pull");
		toutesLesPhrases.add("J'aimerais un pull");
		toutesLesPhrases.add("J'aimerais bien un pull");
		toutesLesPhrases.add("Je veux un pull");
		toutesLesPhrases.add("Je veux bien un pull");
		toutesLesPhrases.add("Je voudrais un pull");
		toutesLesPhrases.add("Je voudrais bien un pull");
		toutesLesPhrases.add("Je souhaite un pull");
		toutesLesPhrases.add("essayer un pull");
		toutesLesPhrases.add("J'aimerais essayer un pull");
		toutesLesPhrases.add("J'aimerais bien essayer un pull");
		toutesLesPhrases.add("Je veux essayer un pull");
		toutesLesPhrases.add("Je veux bien essayer un pull");
		toutesLesPhrases.add("Je voudrais essayer un pull");
		toutesLesPhrases.add("Je voudrais bien essayer un pull");
		toutesLesPhrases.add("Je souhaite essayer un pull");
		
		toutesLesPhrases.add("robe");
		toutesLesPhrases.add("J'aimerais essayer une robe");
		toutesLesPhrases.add("J'aimerais bien essayer une robe");
		toutesLesPhrases.add("Je veux essayer une robe");
		toutesLesPhrases.add("Je veux bien essayer une robe");
		toutesLesPhrases.add("Je voudrais essayer une robe");
		toutesLesPhrases.add("Je voudrais bien essayer une robe");
		toutesLesPhrases.add("Je souhaite essayer une robe");
		toutesLesPhrases.add("essayer une robe");
		toutesLesPhrases.add("J'aimerais une robe");
		toutesLesPhrases.add("J'aimerais bien une robe");
		toutesLesPhrases.add("Je veux une robe");
		toutesLesPhrases.add("Je veux bien une robe");
		toutesLesPhrases.add("Je voudrais une robe");
		toutesLesPhrases.add("Je voudrais bien une robe");
		toutesLesPhrases.add("Je souhaite une robe");
		
		toutesLesPhrases.add("tee shirt");
		toutesLesPhrases.add("J'aimerais un tee shirt");
		toutesLesPhrases.add("J'aimerais bien un tee shirt");
		toutesLesPhrases.add("Je veux un tee shirt");
		toutesLesPhrases.add("Je veux bien un tee shirt");
		toutesLesPhrases.add("Je voudrais un tee shirt");
		toutesLesPhrases.add("Je voudrais bien un tee shirt");
		toutesLesPhrases.add("Je souhaite un tee shirtl");
		toutesLesPhrases.add("essayer un tee shirt");
		toutesLesPhrases.add("J'aimerais essayer un tee shirt");
		toutesLesPhrases.add("J'aimerais bien essayer un tee shirt");
		toutesLesPhrases.add("Je veux essayer un tee shirt");
		toutesLesPhrases.add("Je veux bien essayer un tee shirt");
		toutesLesPhrases.add("Je voudrais essayer un tee shirt");
		toutesLesPhrases.add("Je voudrais bien essayer un tee shirt");
		toutesLesPhrases.add("Je souhaite essayer un tee shirtl");
		
		toutesLesPhrases.add("pantalon ");
		toutesLesPhrases.add("J'aimerais un pantalon");
		toutesLesPhrases.add("J'aimerais bien un pantalon");
		toutesLesPhrases.add("Je veux un pantalon");
		toutesLesPhrases.add("Je veux bien un pantalon");
		toutesLesPhrases.add("Je voudrais un pantalon");
		toutesLesPhrases.add("Je voudrais bien un pantalon");
		toutesLesPhrases.add("Je souhaite un pantalon");
		toutesLesPhrases.add("essayer un pantalon ");
		toutesLesPhrases.add("J'aimerais essayer un pantalon");
		toutesLesPhrases.add("J'aimerais bien essayer un pantalon");
		toutesLesPhrases.add("Je veux essayer un pantalon");
		toutesLesPhrases.add("Je veux bien essayer un pantalon");
		toutesLesPhrases.add("Je voudrais essayer un pantalon");
		toutesLesPhrases.add("Je voudrais bien essayer un pantalon");
		toutesLesPhrases.add("Je souhaite essayer un pantalon");
		
		
		// toutesLesPhrases.add("Changer la couleur"); 		pas de vetement avec differentes couleurs dans la base de données 
		//toutesLesPhrases.add("Changer la taille");		pas de prise en compte de la taille du vetement, il s'adapte automatiquement
		// toutesLesPhrases.add("Ce modèle est-il disponible dans d’autres coloris?");
		toutesLesPhrases.add("essayer");
		toutesLesPhrases.add("J'aimerais essayer");
		toutesLesPhrases.add("J'aimerais bien essayer");
		toutesLesPhrases.add("Je veux essayer");
		toutesLesPhrases.add("Je veux bien essayer");
		toutesLesPhrases.add("Je voudrais essayer");
		toutesLesPhrases.add("Je voudrais bien essayer");
		toutesLesPhrases.add("Je souhaite essayer");
		
		toutesLesPhrases.add("essayer le vêtement");
		toutesLesPhrases.add("J'aimerais essayer le vêtement");
		toutesLesPhrases.add("J'aimerais bien essayer le vêtement");
		toutesLesPhrases.add("Je veux essayer le vêtement");
		toutesLesPhrases.add("Je veux bien essayer le vêtement");
		toutesLesPhrases.add("Je voudrais essayer le vêtement");
		toutesLesPhrases.add("Je voudrais bien essayer le vêtement");
		toutesLesPhrases.add("Je souhaite essayer le vêtement");
		
		toutesLesPhrases.add("Changer de vêtement");
		toutesLesPhrases.add("J'aimerais changer de vêtement");
		toutesLesPhrases.add("J'aimerais bien changer de vêtement");
		toutesLesPhrases.add("Je veux changer de vêtement");
		toutesLesPhrases.add("Je veux bien changer de vêtement");
		toutesLesPhrases.add("Je voudrais changer de vêtement");
		toutesLesPhrases.add("Je voudrais bien changer de vêtement");
		toutesLesPhrases.add("Je souhaite changer de vêtement");
		
		toutesLesPhrases.add("Changer de pull");
		toutesLesPhrases.add("J'aimerais changer de pull");
		toutesLesPhrases.add("J'aimerais bien changer de pull");
		toutesLesPhrases.add("Je veux changer de pull");
		toutesLesPhrases.add("Je veux bien changer de pull");
		toutesLesPhrases.add("Je voudrais changer de pull");
		toutesLesPhrases.add("Je voudrais bien changer de pull");
		toutesLesPhrases.add("Je souhaite changer de pull");
		
		toutesLesPhrases.add("Changer de pantalon");
		toutesLesPhrases.add("J'aimerais changer de pantalon");
		toutesLesPhrases.add("J'aimerais bien changer de pantalon");
		toutesLesPhrases.add("Je veux changer de pantalon");
		toutesLesPhrases.add("Je veux bien changer de pantalon");
		toutesLesPhrases.add("Je voudrais changer de pantalon");
		toutesLesPhrases.add("Je voudrais bien changer de pantalon");
		toutesLesPhrases.add("Je souhaite changer de pantalon");
		
		toutesLesPhrases.add("Changer de robe");
		toutesLesPhrases.add("J'aimerais changer de robe");
		toutesLesPhrases.add("J'aimerais bien changer de robe");
		toutesLesPhrases.add("Je veux changer de robe");
		toutesLesPhrases.add("Je veux bien changer de robe");
		toutesLesPhrases.add("Je voudrais changer de robe");
		toutesLesPhrases.add("Je voudrais bien changer de robe");
		toutesLesPhrases.add("Je souhaite changer de robe");
		
		toutesLesPhrases.add("Changer de tee shirt");
		toutesLesPhrases.add("J'aimerais changer de tee shirt");
		toutesLesPhrases.add("J'aimerais bien changer de tee shirt");
		toutesLesPhrases.add("Je veux changer de tee shirt");
		toutesLesPhrases.add("Je veux bien changer de tee shirt");
		toutesLesPhrases.add("Je voudrais changer de tee shirt");
		toutesLesPhrases.add("Je voudrais bien changer de tee shirt");
		toutesLesPhrases.add("Je souhaite changer de tee shirt");
		
		
		
		// toutesLesPhrases.add("Demander un vêtement");       la commande n'est plus utile car on oriente le projet pour des particuliers
		
		
		
		
		M = toutesLesPhrases.size();
			// M est le nombre de commandes vocales que l'on a dans la base de donnees
		System.out.println(M);
		
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
		
		switch(indice)
		{
		case 0 :
			return (0) ;
			
		case 1 :
			return (0) ;
			
		case 2 :
			return (0) ;
			
		case 3 :
			return (0) ;
			
		case 4 :
			return (0) ;
			
		case 5 :
			return (0) ;
			
		case 6 :
			return (0) ;
			
		case 7 :
			return (0) ;
			
		case 8 :
			return (0) ;	
		
		case 9 :
			return (0) ;	
		
		case 10 :
			return (0) ;	
		
		case 11 :
			return (0) ;	
		
		case 12 :
			return (0) ;	
		
		case 13 :
			return (0) ;	
		
		case 14 :
			return (0) ;	
		
		case 15 :
			return (0) ;	
		
		case 16 :
			return (0) ;	
		
		case 17 :
			return (0) ;	
		
		case 18 :
			return (0) ;	
		
		case 19 :
			return (0) ;	
		
		case 20 :
			return (0) ;	
		
		case 21 :
			return (0) ;	
		
		case 22 :
			return (0) ;	
		
		case 23 :
			return (0) ;	
		
		case 24 :
			return (0) ;	
		
		case 25 :
			return (0) ;	
		
		case 26 :
			return (0) ;	
		
		case 27 :
			return (0) ;
		
		case 28 :
			return (0) ;
		
		case 29 :
			return (0) ;
			
		case 30 :
			return (0) ;
			
		case 31 :
			return (0) ;
			
		case 32 :
			return (0) ;
			
		case 33 :
			return (0) ;
			
		case 34 :
			return (0) ;
			
		case 35 :
			return (0) ;
			
		case 36 :
			return (0) ;
			
		case 37 :
			return (0) ;
			
		case 38 :
			return (0) ;	
		
		case 39 :
			return (0) ;
			
		case 40 :
			return (0) ;
			
		case 41 :
			return (0) ;
			
		case 42 :
			return (0) ;
			
		case 43 :
			return (0) ;
			
		case 44 :
			return (0) ;
			
		case 45 :
			return (0) ;
			
		case 46 :
			return (0) ;
			
		case 47 :
			return (0) ;
			
		case 48 :
			return (0) ;	
		
		case 49 :
			return (0) ;
			
		case 50 :
			return (0) ;
			
		case 51 :
			return (0) ;
			
		case 52 :
			return (0) ;
			
		case 53 :
			return (0) ;
			
		case 54 :
			return (0) ;
			
		case 55 :
			return (0) ;
			
		case 56 :
			return (0) ;
			
		case 57 :
			return (0) ;
			
		case 58 :
			return (0) ;	
		
		case 59 :
			return (0) ;	
		case 60 :
			return (0) ;
			
		case 61 :
			return (0) ;
			
		case 62 :
			return (0) ;
			
		case 63 :
			return (0) ;
			
		case 64 :
			return (0) ;
			
		case 65 :
			return (0) ;
			
		case 66 :
			return (0) ;
			
		case 67 :
			return (0) ;
			
		case 68 :
			return (0) ;	
		
		case 69 :
			return (0) ;	
			
		case 70 :
			return (0) ;
			
		case 71 :
			return (0) ;
			
		case 72 :
			return (0) ;
			
		case 73 :
			return (0) ;
			
		case 74 :
			return (0) ;
			
		case 75 :
			return (0) ;
			
		case 76 :
			return (0) ;
			
		case 77 :
			return (0) ;
			
		case 78 :
			return (0) ;	
		
		case 79 :
			return (0) ;	
			
		case 80 :
			return (0) ;
			
		case 81 :
			return (0) ;
			
		case 82 :
			return (0) ;
			
		case 83 :
			return (0) ;
			
		case 84 :
			return (0) ;
			
		case 85 :
			return (0) ;
			
		case 86 :
			return (0) ;
			
		case 87 :
			return (0) ;
			
		case 88 :
			return (0) ;	
		
		case 89 :
			return (0) ;	
		
			
		
		
		
		
		
		default :
			return(-1);
			
		
		
		}
		
		
				
	}
}
