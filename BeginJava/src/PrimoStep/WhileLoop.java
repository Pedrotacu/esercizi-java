package PrimoStep;

//il while loop scorre attraverso un blocco di codice purchè una condizione specificata sia true.
public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++; // aumenta il valore di una variabile di 1. se non lo si definisce il ciclo è infinito.

/*-----------------------------PROVARE PRIMA UNO E POI L'ALTRO-----------------------------------------------*/
			
			// CICLO DO WHILE
			int s = 0;
			do {
				System.out.println(s);
				s++;
			} while (s < 5);
		}
	}

}
