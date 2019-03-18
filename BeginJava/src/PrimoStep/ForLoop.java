package PrimoStep;

// Il forloop scorre attraverso un blocco di codice un numero di volte.
public class ForLoop {

	public static void main(String[] args) {
		// L'istruzione 1 imposta una variabile prima dell'avvio del ciclo (int i = 0).
		// L'istruzione 2 definisce la condizione per l'esecuzione del ciclo (deve essere inferiore a 5).
		//Se la condizione è vera, il ciclo ricomincia daccapo, se è falso, il ciclo termina.
		// L'istruzione 3 aumenta un valore (i ++) ogni volta che il blocco di codice nel ciclo è stato eseguito.
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//------------------------------- da eseguire separatamente----------------------------------
		
		// ALTRO ESEMPIO 
			for (int p = 0; p <= 10; p = p + 2){
				System.out.println(p);
			}
	}

}
