package java_Classes;


/* Tutto in java è associato a classi e oggetti, insieme ai realtivi attributi e metodi.
 * Ad esempio nella vita reale, un'auto è un oggetto. L'auto ha attributi,
 * come peso e colore, e Metodi, come guida e freno. */

public class Begin {
	
	// Una classe è come un costruttore di oggetti o un "progetto" per la creazione di oggetti.
	
	int x = 5;


	public static void main(String[] args) {
		Begin myObj = new Begin();
		//Begin myObj1 = new Begin();	si possono creare più oggetti
		
		System.out.println(myObj.x);
		//System.out.println(myObj1.x);		

	}	
}
