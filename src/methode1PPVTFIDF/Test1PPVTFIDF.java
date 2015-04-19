package methode1PPVTFIDF;


public class Test1PPVTFIDF {

	public static void main(String[] args) 
	{
		new Methodes1PPVTFIDF();
		
		for ( int i = 0 ; i < Methodes1PPVTFIDF.M ; i ++ ) 
		{
			
			int indiceCommande = Methodes1PPVTFIDF.tableauLePlusProche(Methodes1PPVTFIDF.TableauAnalyse(Methodes1PPVTFIDF.creerCommande(Methodes1PPVTFIDF.toutesLesPhrases.get(i))));
			
			int indiceAction = Methodes1PPVTFIDF.correspondanceClasseAction(indiceCommande);
			
			System.out.println("indiceCommande = " + i +" " +Methodes1PPVTFIDF.toutesLesPhrases.get(i));
			System.out.println("indiceRŽponse = " +indiceCommande +  " " +Methodes1PPVTFIDF.toutesLesPhrases.get(indiceCommande));
			System.out.println("indiceAction = " +indiceAction);
			System.out.println("");
			
		}

	}

}
