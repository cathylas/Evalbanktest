public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	private Ville ville; 
	
	private static int agInstance = 0;

	public Personne(String nom,String prenom,int age,String adresse,Ville ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.ville = ville;
		agInstance++;
	}
	
	public String getNom(){
		return nom;
	}	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getPrenom(){
		return nom;
	}	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int ag) {
		if(ag < 0)	{

		}
		else this.age = ag;
		System.out.println(ag) ;
	}
	public static int getAgInstance() {return agInstance;}

		public String getAdresse(){
			return nom;
		}	
		public void setAdresse(String adresse){
			this.adresse = adresse;
		}
		
		public String getVille(){
			return nom;
		}	
		public void setVille(String nom){
			this.nom = nom;
		}
	
	public void display() {
		System.out.println(nom +" "+ prenom +" "+ age +" "+ adresse +" "+ ville);
	}
}
