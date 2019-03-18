package costruttori;

/* I costruttori possono anche utilizzare i parametri, che vengono utilizzati per inizializzare gli attributi
 * L'esempio seguente aggiunge un parametro int y al costruttore. All'internodel costruttore impostiamo x e y
 * ( x=y). Quando chiamiamo il costruttore, passiamo un parametro al costruttore (5), che imposta il valore x a 5. */

	//Sintassi
	/*int x;
	
	
	public Parametri_costruttore(int y) {
		x = y;
	}
	
	
	public static void main(String[] args) {
		Parametri_costruttore myObj = new Parametri_costruttore(5);
		System.out.println(myObj.x);
	}
	 */
	
	
	//esempio
public class Parametri_costruttore {
		int annoModello;
		String nome;
	
		
		public Parametri_costruttore(int anno, String nombre) { // COSTRUTTORE
			annoModello = anno;
			nome = nombre;
		}
			
			
			public static void main(String[] args) {
				Parametri_costruttore myObj = new Parametri_costruttore(2000, "Pedro");
				System.out.println(myObj.annoModello + " " + myObj.nome);
			}
			
	
}
