// Listing 4.6
// MitarbeiterVerwaltung
package kap4;

import kap2.Mitarbeiter;

public class MitarbeiterVerwaltung {
	public static void main(String[] args) {
		Mitarbeiter[] personalliste = new Mitarbeiter[4];
		//int mitarbeiteranzahl;
		
		personalliste[0] = new Mitarbeiter("Marx","Groucho",8000);
		personalliste[1] = new Mitarbeiter("Marx","Chico",7000);
		personalliste[2] = new Mitarbeiter("Marx","Harpo",7000);
		personalliste[3] = new Mitarbeiter("Marx","Zeppo",7000);
		//int mitarbeiteranzahl = 4;
		
		// alle Mitarbeiter ausgeben
		// besondere Variante der for-schleife zum durchlaufen von Arrays
		for(Mitarbeiter m : personalliste)
			m.datenAusgeben();
	}
}
