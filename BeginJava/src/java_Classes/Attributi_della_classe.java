package java_Classes;
// MODIFICA ATTRIBUTI ("final" impedisce di modificare l'attributo)
public class Attributi_della_classe {
	/* final */int x = 15;	
	
	public static void main(String[] args) {
		Attributi_della_classe mioOggetto = new Attributi_della_classe();
		mioOggetto.x = 5;
		System.out.println(mioOggetto.x);
	}
	
}
