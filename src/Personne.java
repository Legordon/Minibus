import java.util.Scanner;


public class Personne {

	static Scanner scan = new Scanner(System.in);
	String nom = "";
	static Personne[] liste = new Personne[5]; 
	static int nbr = 0;
	
	public static void initialiser(Personne p) {
		System.out.println("Donner un nom");
		p.nom = scan.nextLine();
		liste[nbr] = p;
		nbr++;
	}
	
	public static void lister() {
		System.out.println("Liste des personnes :");
		System.out.println("Chauffeur -> "+Minibus.passager[0].nom);
		System.out.println();
		
		for(int i = 1; i < liste.length; i ++) {
			System.out.println(i +" "+ liste[i].nom);
		}
		System.out.println();
	}
}