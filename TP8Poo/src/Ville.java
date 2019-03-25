public class Ville {
	private String nom; //nom de la ville
	private String pays;  //nom du pays
	private int nbHabitants;  //nombre d'habitants

	private static int nbInstance = 0;

	public Ville(String nom, String pays, int nbHabitants) {
		this.nom = nom;
		this.pays = pays;
		this.nbHabitants = nbHabitants;
		nbInstance++;
	}

	public String getNom(){
		return nom;
	}	
	public void setNom(String nom){
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nb) {
		if(nb < 0)	{

		}
		else this.nbHabitants = nb;
		System.out.println(nb);
	}
	public static int getNbInstance() {return nbInstance;}

	public void display() {
		System.out.println(nom +","+ pays+","+nbHabitants );
	}

}
