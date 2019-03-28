package java_Classes;

public class Metodi_di_accesso_con_un_oggetto {
	
	// creare un metodo fullThrottle()
	public void fullThrottle() {
		System.out.println("la macchia sta andando velocissima!");
	}
	
	// creare un metodo speed() e aggiungere un parametro
	public void speed(int z) {
	System.out.println("la velocità massima è: " + z);
	}
	
	
	public static void main(String[] args) {
	Metodi_di_accesso_con_un_oggetto nOggetto = new Metodi_di_accesso_con_un_oggetto();//dentro il metodo main, chiamare il metodo dentro l'oggetto myCar
		
		nOggetto.fullThrottle(); // chiamare il metodo fullThrottle()
		nOggetto.speed(280); // chiamare il metodo speed()
	}

}
