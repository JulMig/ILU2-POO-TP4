package scenarioTest;

import villagegaulois.*;
import produit.*;
import personnages.*;

public class ScenarioTest {
	public static void main(String[] args) {
		
		IEtal[] marche = new IEtal[3];
		/*
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
	
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		*/
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal etalObelix = new Etal();
		Etal etalAsterix = new Etal();
		Etal etalPoissonier = new Etal();
		
		etalObelix.installerVendeur(obelix, sangliersObelix, 8);
		etalAsterix.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoissonier.installerVendeur(ordralfabetix, poissons, 7);

		
		
	}
	
}
