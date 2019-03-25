public class Test {

	public static void main (String[]args) {
		/*
		 * System.out.println("nombre d'instance =" + Ville.getNbInstance());
		 * 
		 * Ville v1 = new Ville("Toulouse", "France", 466297);
		 * System.out.println("nombre d'instance =" + Ville.getNbInstance());
		 * 
		 * Ville v2 = new Ville("Valence", "Espagne", 790201);
		 * System.out.println("nombre d'instance =" + Ville.getNbInstance());
		 * 
		 * Ville v3 = new Ville("Donaueschingen", "Allemagne", 21746);
		 * 
		 * System.out.println("nombre d'instance =" + Ville.getNbInstance());
		 */	
					//String nom,String prenom,int age,String adresse
		Personne p1 = new Personne("Dupont","robert",56,"2 rte de grenoble",new Ville ("Nice","FR",300000));
				
		p1.display();		
	}




	/*
	 * v1.display();
	 * 
	 * v1.setNom("Toulouse"); v1.setPays("Espagne"); v1.setNbHabitants(150000);
	 * 
	 * v1.display();
	 */
}


