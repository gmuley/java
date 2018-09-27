//Listing 4.6.1
//Mitarbeiter 

package kap2;

public class Mitarbeiter {
	
	// Deklaration
	String m_name;
	String m_vorname;
	int m_gehalt;
	
	// Konstruktor
	public Mitarbeiter(String name, String vorname, int gehalt) {
		
		// Zuweisung
		m_name = name;
		m_vorname = vorname;
		m_gehalt = gehalt;
	}
	
	// Methode Ausgabe der Mitarbeiterdaten
	public void datenAusgeben() {
		System.out.println("\n");
		System.out.println("Name	: " + m_name);
		System.out.println("Vorname	: " + m_vorname);
		System.out.println("Gehalt	: " + m_gehalt + " Euro");
	}
	
	// Methode Gehalt erhöhen
	public void gehaltErhoehen (int erhoehung) {
		m_gehalt += erhoehung;
	}
}
