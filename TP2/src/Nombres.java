import java.util.Scanner;

public class Nombres {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("saisissez une valeur : ");
		Scanner scan = new Scanner(System.in);		
		int val = scan.nextInt();
		
		System.out.println("vous avez saisi la valeur :" + val);
		
		if ( val > 0 ) {
			System.out.println( "positif");
		}
		
		else if ( val < 0 ) {
			System.out.println(" négatif");
		}
		
		else {
			System.out.println(" nul");
		}
		
		
		
		
	}
}