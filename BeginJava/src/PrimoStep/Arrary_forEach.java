package PrimoStep;

public class Arrary_forEach {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		//L'esempio sopra può essere letto in questo modo: per ogni
		// String elemento (chiamato i - come in i ndex) in auto , stampa il valore di i .
		//il ciclo for è più semplice da scrivere
		
		
		int[][] mynumber = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = mynumber[1][2];
		System.out.println(x);
		
		
		int[][] mionumero = { {1, 2, 3, 4}, {5, 6, 7} };
	    int y = mionumero[1][2];
	    System.out.println(x); 
	    //Questo esempio accede al terzo elemento (2) nel secondo array (1) di myNumbers:
	    
	    
	    int[][] mynumero = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < mynumero.length; ++i) {
	        for(int j = 0; j < mynumero[i].length; ++j) {
	          System.out.println(mynumero[i][j]);
	          //Possiamo anche usare l' for loopinterno di un altro for loopper ottenere
	          //gli elementi di una matrice bidimensionale (dobbiamo ancora indicare i due indici):
	        }
	      }

	}

}
