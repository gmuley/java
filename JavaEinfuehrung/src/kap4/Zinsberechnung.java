// Listing 4.2
// Zinsberechnung (Berechnung eig. Methode)

package kap4;

public class Zinsberechnung {	
	
	public static void zinsBerechnen(double laufzeit) {
		double startkapital = 15000;
		double zinssatz = 3.5;
		double endkapital;
	
		// 	Berechnung des Endkapitals
		endkapital = startkapital * Math.pow((1 + zinssatz/100), laufzeit);
		System.out.println("Nach " + (int) laufzeit + ". Jahr: " + (int)endkapital + " Euro");
	}

	public static void main(String[] args) {
		for(int i=1; i<8; i++) {
			zinsBerechnen(i);
		}
	}
}
