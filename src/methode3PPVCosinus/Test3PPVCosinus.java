package methode3PPVCosinus;

public class Test3PPVCosinus {

	public static void main(String[] args) 
	{
		new Methodes3PPVCosinus();
		
		for ( int i = 0 ; i < Methodes3PPVCosinus.M ; i ++ ) 
		{
			System.out.println( "indice commande = " + i);
			int indiceAction = Methodes3PPVCosinus.commandeLaPlusProbable((Methodes3PPVCosinus.TableauAnalyse(Methodes3PPVCosinus.creerCommande(Methodes3PPVCosinus.toutesLesPhrases.get(i)))));     
			
			
			System.out.println("indiceAction = " + indiceAction);
			System.out.println("");
		
		}
	
	}

}
