package PrimoStep;
// un metodo è un blocco di codice che viene eseguito solo quando viene chiamato
public class Methods {
	//i metodi vengono utilizzati per eseguire determinate azioni e sono anche noti come funzioni
	static void myMethod(){
		//UN METODO DEVE ESSERE DICHIARATO ALL'INTERNO DELLA CLASSE
		/* myMethod: è il nome del metodo
		 * static: significa che il metodo appartiene alla classe Methods e non a un oggetto della classe Methods
		 * void: significa che questo metodo non ha un valore di ritorno */
		System.out.println("ola beba");
	}
	
	public static void main(String[] args){
		myMethod(); //puo essere chiamato piu volte
	}

	
}
