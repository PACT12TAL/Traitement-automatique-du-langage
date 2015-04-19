package methode1PPVCosinus;

public class Test1PPVCosinus {

	public static void main(String[] args) 
	{
		
		new Methodes1PPVCosinus();
		
		for ( int i = 0 ; i < Methodes1PPVCosinus.M ; i ++ ) 
		{
			
			int indiceCommande = Methodes1PPVCosinus.tableauLePlusProche(Methodes1PPVCosinus.TableauAnalyse(Methodes1PPVCosinus.creerCommande(Methodes1PPVCosinus.toutesLesPhrases.get(i))));
			
			int indiceAction = Methodes1PPVCosinus.correspondanceClasseAction(indiceCommande);
			
			System.out.println("indiceCommande = " + i);
			System.out.println("indiceRŽponse = " + indiceCommande);
			System.out.println("indiceAction = " + indiceAction);
			System.out.println("");
			
		}
	}

}
