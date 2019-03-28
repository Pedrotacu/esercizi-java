package incapsulamento;

/* L'INCAPSULAMENTO SI ASSICURA CHE I DATI SENSIBILI SIANO NASCOSTI AGLI UTENTI, per ottenere ciò devi:
 * - dichiarare le variabili di classe/attributi come PRIVATE(accessibili solo all'interno della stessa classe)
 * - fornire metodi pubblici di SETTER e GETTER per accedere e aggiornare il valore di una variabile PRIVATE*/

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String nuovoName){
		this.name = nuovoName; 
	}

}
