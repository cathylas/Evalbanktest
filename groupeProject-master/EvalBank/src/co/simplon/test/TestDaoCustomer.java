package co.simplon.test;
import co.simplon.dao.*;
import co.simplon.entities.Customer;
public class TestDaoCustomer {
	
	public static void runTests() {
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider 
		// Comment faire ici ?
		
		CustomerDao cd = new CustomerDao();		
				
		Customer c1 = new Customer(13,"Hanakin","Skywalker");
		
		if(cd.create(c1))	System.out.println("insertion ok de " + c1);
		else System.out.println("insertion impossible, client avec cet id existe déjà ");
				
		Customer c2 = cd.find(c1.getIdCust()); 		
		if(c2 == null)	System.out.println("ce client n'est pas contenu en base ");
		else System.out.println("client trouvé en base : " + c2);
		
		c1.setFirstName("Vador");
		if(cd.update(c1)) System.out.println("ok mise à jour " + c1);
		else System.out.println("mise à jour impossible ");
		
		if(cd.delete(c1))	System.out.println("delete ok " + c1);
		else System.out.println("delete impossible ");				
	}

}
