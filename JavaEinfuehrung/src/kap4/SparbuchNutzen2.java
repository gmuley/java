// Listing 4.5
// SparbuchNutzen2
// wird nur kompiliert, wenn im aktuellen
// Verzeichnis Sparbuch.class zu finden ist

package kap4;

// Hauptklasse des Programms
class SparbuchNutzen2 {
	public static void main(String[] args) {
		Sparbuch meinSparbuch = new Sparbuch(0,3);
		meinSparbuch.einzahlen(10000);
		
		System.out.println("Ertrag nach 5 Jahren : \n");
		System.out.println("\t ohne Zinseszins: " + (int) meinSparbuch.ertrag(5));
		System.out.println("\t mit Zinseszins: " + (int) meinSparbuch.ertragZ(5));
	}
}