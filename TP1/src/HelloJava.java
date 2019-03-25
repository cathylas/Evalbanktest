import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in );
		
		System.out.println("Bonjour est bienvenu sur mon programme java");
		
		System.out.println("quel est votre nom?");
		String str = sc.nextLine();

		System.out.println("bonjour "  + str);
		System.out.println("quel est votre prenom?");
		String str1 = sc.nextLine();
		
		System.out.println("quel age avez-vous?");
		int str3 = sc.nextInt();
		
		int age = 15;

		if (age >= 18)
		{
		    System.out.println("bienvenu vous êtes majeur!");
		}
		else if (age >= 15)
		{
		    System.out.println("Vous n'êtes pas majeur !");
		}
		else
		{
		    System.out.println("Vous n'êtes pas majeur!");
		}
			
		
		
		
		
	}
	
	
	}

	