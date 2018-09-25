package Test;

public class HalloWelt {

	public static void main(String[] args) {
		// new instance
		Hello test = new Hello();
		
		// Display Hello World on screen (direct output)
		System.out.println("Hello World!");
		
		// Display Hallo Welt on screen (from class Hello)
		test.sayHello();
	}

}
