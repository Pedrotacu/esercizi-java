package PrimoStep;
// CONTINUE istruzione interrompe una iterazione (nel ciclo), se si verifica una
// condizione specificata e continua con la successiva iterazione nel ciclo.
public class Break_Continue2 {

	public static void main(String[] args) {
		//Questo esempio salta il valore di 4:
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			} 

	}

}
