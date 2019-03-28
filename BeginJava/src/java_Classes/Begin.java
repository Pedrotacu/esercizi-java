package java_Classes;


/* Tutto in java � associato a classi e oggetti, insieme ai realtivi attributi e metodi.
 * Ad esempio nella vita reale, un'auto � un oggetto. L'auto ha attributi,
 * come peso e colore, e Metodi, come guida e freno. */

public class Begin {
	
	// Una classe � come un costruttore di oggetti o un "progetto" per la creazione di oggetti.
	
	int x = 5;


	public static void main(String[] args) {
		Begin myObj = new Begin();
		//Begin myObj1 = new Begin();	si possono creare pi� oggetti
		
		System.out.println(myObj.x);
		//System.out.println(myObj1.x);		

	}	
}
