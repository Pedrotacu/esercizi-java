package PrimoStep;

public class MyClass {

	public static void main(String[] args) {
		/*----------------------TIPI INTERI---------------------------------*/
		byte numb = 125;	// from -128 to 127
		short numb1 = 5152;	// from -32768 to 32767
		int b = 1;
		long numb2 = 65156651981651l;	// terminare il valore con una l
		
		/*-----------------TIPI DI VIRGOLA MOBILE----------------------------*/
		float numb3 = 25.65f;	// terminare il valore con una f
		double numb4 = 24565.6556d;	// terminare il valore con una d. è più sicuro per la maggior parte dei calcoli
		
		/*--------------------------BOOLEAN----------------------------------*/
		boolean vero = true;
		boolean falso = false;
		
		/*-------------------------Personaggi--------------------------------*/
		char one = 'D';	// memorizza un solo tipo di dato e dev'essere racchiuso tra apici
		
		/*--------------------------STRINGHE---------------------------------*/
		String firstname = "Pedro";
		
		

		System.out.println(numb);
		System.out.println(numb1);
		System.out.println(b);
		System.out.println(numb2);
		
		System.out.println(numb3);
		System.out.println(numb4);
		
		System.out.println(vero);
		System.out.println(falso);
		
		System.out.println(one);
		
		System.out.println("ciao " + firstname);

	}

}
