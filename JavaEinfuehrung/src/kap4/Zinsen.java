// Listing 4.1
// Zinsen 

package kap4;

public class Zinsen {
	public static void main (String[] args) {
		double startkapital = 15000;
		double zinssatz = 3.5;
		double laufzeit;
		double endkapital;
		
		// Berechnung des Endkapitals
		System.out.println();
		endkapital = startkapital * Math.pow((1 + zinssatz/100),1);
		System.out.println("Nach 1. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),2);
		System.out.println("Nach 2. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),3);
		System.out.println("Nach 3. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),4);
		System.out.println("Nach 4. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),5);
		System.out.println("Nach 5. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),6);
		System.out.println("Nach 6. Jahr: " + (int)endkapital + " Euro");
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),7);
		System.out.println("Nach 7. Jahr: " + (int)endkapital + " Euro");
	}
}
