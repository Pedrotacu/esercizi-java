package PrimoStep;
//BREAK and CONTINUE in While Loop
public class Break_Continue3 {

	public static void main(String[] args) {
		// Puoi anche usare break in loop while:
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println(i);
			if (i == 4) {
				break;
			}
		}
	}
}
