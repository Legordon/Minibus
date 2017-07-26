public class Minibus {

	public static Personne[] passager = new Personne[5];
	public static int effectif = 0;

	// public Minibus() {
	// for(int i = 0; i < passager.length; i ++) {
	// passager[i]=new Personne();
	// }
	// }

	// faire monter une personne
	public static boolean embarquer(Personne p) {
		
		for (int i = 1; i < passager.length; i++) {
			if (passager[i] == null) {
				passager[i] = p;
				effectif++;
				return true;
			}
		}
		return false;
	}

	// rechercher si une personne est a bord
	public static int estAbord(String n) {
		int place = 0;
		for (int i = 0; i < passager.length; i++) {
			if (passager[i] == null) {
			} else if (n.compareTo(passager[i].nom) == 0) {
				place = i;
				return place;
			}
		}
		return place = -1;
	}

	// faire descendre une personne
	public static void debarquer(String n) {
		for (int i = 0; i < passager.length; i++) {
			if (passager[i] == null) {
			} else if (n.compareTo(passager[i].nom) == 0) {
				passager[i] = null;
				effectif--;
				System.out.println(n + " est déscendu du bus.");
			}
		}
	}

	// affichage
	public static void afficher() {
		System.out.println("Manifeste du bus.");
		for (int i = 0; i < passager.length; i++) {
			if (passager[i] == null) {
				System.out.println("vide");
			} else {
				System.out.println(passager[i].nom);
			}
		}
	}
}
