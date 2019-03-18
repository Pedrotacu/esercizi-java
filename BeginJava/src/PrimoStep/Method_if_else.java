package PrimoStep;

public class Method_if_else {
	static void mioMetodo(int age) {
		if (age < 18) {
			System.out.println("accesso negato");
		} else {
			System.out.println("accesso acconsentito");
		}
	}
	
	
	public static void main (String[] args) {
		mioMetodo(15);
		mioMetodo(82);
	}
}
