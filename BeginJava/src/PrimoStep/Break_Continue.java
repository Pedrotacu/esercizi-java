package PrimoStep;
// BREAK istruzione può anche essere utilizzata per saltare fuori da un ciclo .
public class Break_Continue {

	public static void main(String[] args) {
		//Questo esempio salta fuori dal ciclo quando i è uguale a 4:
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

	}

}
