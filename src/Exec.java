import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int choix = 0;
		char sortie = 'n';

		// déclaration des objets personnes
		Minibus bus = new Minibus();
		Personne chauffeur = new Personne();
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		Personne p4 = new Personne();

		// initialisation des personnes
		Personne.initialiser(chauffeur);
		Personne.initialiser(p1);
		Personne.initialiser(p2);
		Personne.initialiser(p3);
		Personne.initialiser(p4);

		// installe le chauffeur a la place 0
		bus.passager[0] = chauffeur;
		System.out.println("Le chauffeur " + chauffeur.nom + " a pris place");

		while (run) {
			if (choix == 0) {

				System.out.println("====================================");
				System.out.println();
				System.out.println("\tMenu principal :");
				System.out.println();
				System.out.println(" 1 : Faire monter une personne.");
				System.out.println(" 2 : Faire descendre une personne.");
				System.out
						.println(" 3 : Verifier si une personne est dans le bus.");
				System.out.println(" 4 : Afficher les passagers du bus.");
				System.out.println();
				System.out.println("====================================");

				choix = scan.nextInt();

			} else if (choix == 1) { 

				// embarquer une personne
				System.out.println("Qui faire monter dans le bus ?");
				System.out.println();
				Personne.lister();
				scan = new Scanner(System.in);
				int monte = scan.nextInt();
				
				if (Minibus.effectif < 5) {
					if (Minibus.embarquer(Personne.liste[monte]) == true) {
						System.out.println("Personne " +(String) bus.passager[monte-1].nom+ " est montée a bord !");
					} else {
						System.out.println("Personne " +(String) bus.passager[monte-1].nom+ " n'est PAS montée a bord !");
					}
				} else {
					System.out.println("Bus plein ! ");
				}
				System.out.println("Sortir ? (o/n)");
				scan.nextLine();
				sortie = scan.nextLine().charAt(0);
				if (sortie == 'o') {
					choix = 0;
				}
				
			} else if (choix == 2) {
				
				System.out.println();
				System.out.println("Faire descendre ");
				System.out.println();
				Minibus.afficher();
				scan = new Scanner(System.in);
				Minibus.debarquer(scan.nextLine());
				System.out.println("Sortir ? (o/n)");
				sortie = scan.nextLine().charAt(0);
				if (sortie == 'o') {
					choix = 0;
				}

			} else if (choix == 3) {
				
				System.out.println("Verifier si une personne est a bord par son nom");
				Personne.lister();
				scan = new Scanner(System.in);
				int resultAbord = Minibus.estAbord(scan.nextLine());
				if (resultAbord == -1) {
					System.out.println("La personne n'est pas a bord.");
				} else {
					System.out.println("La personne est a la place : "
							+ resultAbord);
				}
				System.out.println("Sortir ? (o/n)");
				sortie = scan.nextLine().charAt(0);
				if (sortie == 'o') {
					choix = 0;
				}

			} else if (choix == 4) {
				
				Minibus.afficher();
				System.out.println("Sortir ? (o/n)");
				scan = new Scanner(System.in);
				sortie = scan.nextLine().charAt(0);
				if (sortie == 'o') {
					choix = 0;
				}
			}

		}
	}
}
