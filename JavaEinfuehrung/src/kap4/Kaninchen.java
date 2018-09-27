// Listing 4.7
// Kaninchen

package kap4;

public class Kaninchen {
	public static void main(String[] args) {
		double pop = 2;
		
		System.out.println();
		
		for(int jahr = 1; jahr <= 10; jahr++) {
			pop = 2*Math.exp(Math.log(15)*jahr);
			System.out.println("Nach " + jahr + ". Jahr: " + (long) pop + " Tiere");
		}
	}
}
