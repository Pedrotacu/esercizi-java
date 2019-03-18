package PrimoStep;
//BREAK and CONTINUE in While Loop
public class Break_Continue4 {

	public static void main(String[] args) {
		// Puoi anche usare continue in loop while:
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		} 
	}

}
