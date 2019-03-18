package Java_Classes;

public class Oggetti_Multipli {
	int p = 200;

	
	public static void main(String[] args) {
		Oggetti_Multipli primoOggetto = new Oggetti_Multipli();
		Oggetti_Multipli secondoOggetto = new Oggetti_Multipli();
		secondoOggetto.p = 10;
		
		System.out.println(primoOggetto.p);
		System.out.println(secondoOggetto.p);
		
	}

}
