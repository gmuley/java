// Listing 4.10
// Exception Test (Abfangen von Fehlern im Programmfluss)

package kap4;

public class ExceptionTest {
	public static void main(String[] args) {
		int i;
		int[] zahlen = new int[100];
		System.out.println();
		
		// hier kann der Fehler auftreten also absichern
		try {
			for(i=0; i<=100; i++) {
				System.out.println("i hat den Wert " + i +"\n");
				zahlen[i] = i;
			}
		}
		
		// hier ist die Fehlerbehandlung
		catch(ArrayIndexOutOfBoundsException e) {
			//System.err.println("Ein illegaler Zugriff!\n");
			System.err.println();
		}
	}
}
