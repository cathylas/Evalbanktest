import java.util.Scanner;

public class Pair{//debut class
	
	public static void main(String[] args) { //debut main
		// TODO Auto-generated method stub
		System.out.println("debut du programme, saisir une valeur");
		Scanner scan = new Scanner ( System.in );
		int val = scan.nextInt();
			
		if (val > 0){
			System.out.print("pair");
		}
		else if (val < 0) {
			System.out.print("impair");
		}
		else {
			System.out.print("nul");
		}
		
		
	}//fin main	

	
}//fin class