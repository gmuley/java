
public class Tierpark {

	public static void main(String[] args) {
		// Main class Tierpark manage subclasses animals
		Papagei ara = new Papagei();
		Elefant dumbo = new Elefant();
		Ziege klara = new Ziege();
		Loewe herbert = new Loewe();
		
		System.out.print("Der Papagei sagt: ");
		ara.parrotSpeak();
		System.out.print ("Der Elefant macht: ");
		dumbo.elefantTrumpeted();
		System.out.print("Die Ziege macht: ");
		klara.ziegeMaeh();
		System.out.print("Der Löwe brüllt: ");
		herbert.loeweBruell();
	}

}
