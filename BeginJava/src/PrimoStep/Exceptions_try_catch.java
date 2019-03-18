package PrimoStep;

public class Exceptions_try_catch {

	public static void main(String[] args) {
		//try è un istruzione che consente di definire un blocco di codice da testare
		//per gli errori mentre è in esecuzione
		
		//catch è un istruzione che consente di definire un blocco di codice da eseguire,
		//se si verifica un errore nel blocco try

		/* int[] myNumbers = {1, 2, 3};
		System.out.print(myNumbers[10]); // error!
		*/
		
		
		// Se si verifica un errore, possiamo utilizzarlo try...catchper rilevare l'errore ed eseguire del codice per gestirlo:
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.print(myNumbers[10]);
		} catch (Exception e) {
		      System.out.println("Something went wrong");
		//L' finallyistruzione ti consente di eseguire il codice, dopo try...catch, indipendentemente dal risultato:
	    }finally {
	        System.out.println("The 'try catch' is finished.");
	    }
	}

}
