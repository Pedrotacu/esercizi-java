package costruttori;

public class Prova {
	String x;
	String y;
	int z;
	
	public Prova (String saluto, String query, int risposta) {
		x = saluto;
		y = query;
		z = risposta;
	}
	
	public static void main(String[] args) {
		Prova myObj = new Prova("Ciao!", "quanti anni hai?", 23);
		System.out.println(myObj.x + " " + myObj.y);
		System.out.println("Hey! ne ho " + myObj.z);
	}

}
