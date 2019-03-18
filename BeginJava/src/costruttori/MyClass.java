package costruttori;

/* un Costruttore è un metodo speciale utilizzato per inizializzare gli oggetti. Il costruttore viene chiamato quando
 * viene creato un oggetto di una classe. Può essere utilizzato per impostare i valori iniziali per gli attributi dell'oggetto*/
public class MyClass {
	int x; // creare un'attributo di classe
	
	
	// creare una classe costruttore per la classe
	/* IL NOME DEL COSTRUTTORE DEVE CORRISPONDERE AL NOME DELLA CLASSE
	 * e non può avere un tipo di ritorno (void) */
	public MyClass() {
		x = 5; // imposta il valore iniziale per l'attributo di classe x 
	}
	
	
	
	public static void main(String[] args) {
		MyClass myObj = new MyClass(); // questo oggetto chiamerà il costruttore
		System.out.println(myObj.x);
		
	}

}
