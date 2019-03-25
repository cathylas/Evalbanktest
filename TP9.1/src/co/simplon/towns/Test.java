package co.simplon.towns;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Capitale cap = new Capitale("Paris","France",100000,"Tour-Eiffel");
		Capitale cap1 = new Capitale("Londre","Angleterre",400000,"Bigben");
		Capitale cap2 = new Capitale("Madrid","Espagne",1000000,"Palais-Royal");
		//cap.afficher();
		cap.display();
		cap1.display();
		cap2.display();
		
		System.out.println(cap);
		
	}

	
}
