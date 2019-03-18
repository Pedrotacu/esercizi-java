
package PrimoStep;
// gli array vengono utilizzati per memorizzare più valori in una singola variabile
public class Array {

	public static void main(String[] args) {
//Per modificare il valore di un elemento specifico, fare riferimento al numero di indice:
		String [] cars = {"Ferrari", "Ford", "Lamborghini", "BMW"};
		cars[2] = "Mercedes";
		System.out.println(cars [2]);
		
		String[] macchine = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(macchine.length);
		
		// È possibile scorrere gli elementi dell'array con il forciclo e utilizzare la
		// length proprietà per specificare quante volte deve essere eseguito il ciclo.
		String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < carros.length; i++) {
		  System.out.println(carros[i]);
		}
	}

}
