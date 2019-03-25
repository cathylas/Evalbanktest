package co.simplon.peoples;

public class Employé extends Personne{
    
	 private String entreprise;
     private double salaire; 
    
     public Employé (String Personne,String prenom, int age, String adresse) {
     
     super(nomPersonne,prenomPersonne, int age,nomAdresse);
     this.entreprise = entreprise;
     this.salaire = salaire;		 
      
     }
     
	@Override
	public String toString() {
		return "Employé [entreprise=" + entreprise + ", salaire=" + salaire + ", age=" + age + ", nomAdresse="
				+ nomAdresse + "]"+super.toString();;
	}

	
	}
    



		
	
