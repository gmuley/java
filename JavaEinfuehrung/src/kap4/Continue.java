// Listing 4.9
// Continue

package kap4;

public class Continue {
	public static void main(String[] args) {
		int i;
		
		System.out.println();
		for(i = 0; i<1000; i++) {
			if(i != 500)
				continue;
			
			System.out.println("i hat den Wert 500!");
		}
	}
}
