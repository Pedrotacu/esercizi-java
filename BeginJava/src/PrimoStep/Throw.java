package PrimoStep;
//L' throw istruzione ti consente di creare un errore personalizzato.
public class Throw {
//throw viene utilizzato insieme a un tipo di eccezione.(ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException)
		static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("accesso negato, devi essere maggiorenne");	
		} else {
			System.out.println("accesso concesso");
		}
	}
		public static void main(String[] args) {
			checkAge(15); // è inferiore a 18 quindi darà l'eccezione
		}
	
}
