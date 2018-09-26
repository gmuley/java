// Listing 3.3
// MitarbeiterBeispiel 

package kap3;

class Mitarbeiter {
	
	// Deklaration
	String m_name;
	String m_vorname;
	int m_gehalt;
	
	// Konstruktor
	Mitarbeiter(String name, String vorname, int gehalt) {
		
		// Zuweisung
		m_name = name;
		m_vorname = vorname;
		m_gehalt = gehalt;
	}
	
	// Methode Ausgabe der Mitarbeiterdaten
	void datenAusgeben() {
		System.out.println("\n");
		System.out.println("Name	: " + m_name);
		System.out.println("Vorname	: " + m_vorname);
		System.out.println("Gehalt	: " + m_gehalt + " Euro");
	}
	
	// Methode Gehalt erhöhen
	void gehaltErhoehen (int erhoehung) {
		m_gehalt += erhoehung;
	}
}

public class MitarbeiterBeispiel {
	public static void main (String[] args) {
		// Zwei neue Mitarbeiter instanzieren
		Mitarbeiter billy = new Mitarbeiter ("Gates","Bill",3000);
		Mitarbeiter stevie = new Mitarbeiter ("Jobs","Steve",3500);
		
		// Daten ausgeben
		billy.datenAusgeben();
		stevie.datenAusgeben();
		
		// Gehalt von a erhöhen
		billy.gehaltErhoehen(500);
		
		// Kontrolle
		billy.datenAusgeben();
		stevie.datenAusgeben();
	}
}
