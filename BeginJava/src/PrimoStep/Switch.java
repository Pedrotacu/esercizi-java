package PrimoStep;

public class Switch {

	public static void main(String[] args) {
		
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		}
		
		//parola chiave DEFAULT {prima abbiamo usato break}
		int giorno = 4;
		switch (giorno) {
		case 6:
			System.out.println("oggi è giovedi");
			break;
		case 7:
			System.out.println("oggi è venerdi");
			break;
		default:
			System.out.println("sto aspettando il fine settimana");
		}

	}

}
