package co.simplon.peoples;

public class Personne {
	private String nom; 
	private String prenom;
	private int age; 
	private String adresse;

	public Personne(String nom, String prenom, int age, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;

	}

	public String getNom(){
		return nom;
	}	
	public void setNom(String nom){
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0)	{

		}
		else this.age = age;
		System.out.println(age);
	}
		public String getAdresse(){
			return adresse;
		}	
		public void setAdresse(String adresse){
			this.adresse = adresse;
		}
		

	public void display() {
		System.out.println(nom +","+ prenom +","+ age +","+ adresse +",");
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age =" + age + ",adresse =" +  adresse +"]";
	

	

	}
	}
		

	