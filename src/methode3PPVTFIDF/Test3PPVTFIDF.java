package methode3PPVTFIDF;

public class Test3PPVTFIDF {

	public static void main(String[] args) 
	{
		new Methodes3PPVTFIDF();
		
		for ( int i = 0 ; i < Methodes3PPVTFIDF.M ; i ++ ) 
		{
			System.out.println("indiceCommande = " + i +" " +Methodes3PPVTFIDF.toutesLesPhrases.get(i));
			
			int indiceAction = Methodes3PPVTFIDF.commandeLaPlusProbable(Methodes3PPVTFIDF.ConversionTableauTFIDF(Methodes3PPVTFIDF.TableauAnalyse(Methodes3PPVTFIDF.creerCommande(Methodes3PPVTFIDF.toutesLesPhrases.get(i)))));
		
			System.out.println("indiceAction = "+ indiceAction);
			System.out.println("");
			
		}

	}

}
