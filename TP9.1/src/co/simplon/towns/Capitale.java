package co.simplon.towns;

public class Capitale extends Ville {
    
	private String monument;
	
	
	public Capitale(String nomVille,String nomPays,int nbHabitants,String monument){
		super(nomVille,nomPays,nbHabitants);
		this.monument = monument;


	}


	@Override
	public String toString() {
		return "Capitale [monument=" + monument + "]"+super.toString();
	}
}

  