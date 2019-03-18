package PrimoStep;

public class Strings {

	public static void main(java.lang.String[] args) {
		//come contare i caratteri in una stringa - METODO LENGTH
				String txt = "Hola ";
				String txt1 = "CIAO";
				//come contare i caratteri in una stringa - METODO LENGTH
				System.out.println("il numero dei caratteri della mia stringa è: " + txt.length());
				// METODO toUpperCase() - MAIUSCOLO
				System.out.println(txt.toUpperCase());
				// METODO toLowerCase() -MINUSCOLO
				System.out.println(txt.toLowerCase());
				// METODO indexOF() - localizzare dove si trova il cursore
				System.out.println(txt.indexOf("l")); // output 2
				// CONCATENAZIONE DELLE STRINGHE CON L'OPERATORE "+" OPPURE USARE IL METODO concat()
				System.out.println(txt + " " + txt1);
				System.out.println(txt.concat(txt1));
				
				// AGGIUNGE due variabili il "+" {i numeri sono AGGIUNTI}
				int x = 10;
			    int y = 20;
			    int z = x + y;
			    
			    System.out.println(z);
			    // {le strighe sono CONCATENATE}
			    String conc = "10";
			    String conc1 = "20";
			    String som = conc + conc1;   // z will be 1020 (a String)
			    System.out.println(som);

	}

}
