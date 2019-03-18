package Java_Classes;

public class Public_and_Static {

	/* -il metodo static significa che è possibile accedervi senza creare un oggetto della classe.
	 * -il metodo public è possibili accedervi solo agli oggetti. */

	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	// Public method
	public void myPublicMethod() {
		System.out.println("Public method must be called by creating object");
	}
	
	
	// Main method
	public static void main(String[] args) {
		myStaticMethod();
		
		
		Public_and_Static myObj = new Public_and_Static(); // creazione del oggetto
		myObj.myPublicMethod(); // chiama il metodo public sull'oggetto
		
	}

}
