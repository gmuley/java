// Listing 3.2
// Operatoren

package kap3;

public class Operatoren {
	public static void main (String[] args) {
		
		// Deklaration
		int x, y, z;
		int ergebnis_1, ergebnis_2;
		
		// Initialisierung
		x = 1;
		y = 2;
		z = 3;
		
		// Verwendung
		ergebnis_1 = x + y * z;		// = 7
		ergebnis_2 = (5 -3) * z;	// = 6
		
		// Ausgabe
		System.out.println(ergebnis_1);
		System.out.println(ergebnis_2);
		
		x = x + z;					// = 4
		System.out.println(x);
		x += z;						// = 7
		System.out.println(x);
		x += 1;						// = 8
		System.out.println(x);
		x++;						// = 9
		System.out.println(x);
	}
}
