package modificatori_di_accesso.modificatori_private;

//IL CODICE è ACCESSIBILE SOLO ALL'INTERNO DELLA CLASSE DICHIARATA

public class Privato{
		
	  private String fname = "John";
	  private String lname = "Doe";
	  private String email = "john@doe.com";
	  private int age = 24;
	  
	  public static void main(String[] args) {
	    Privato myObj = new Privato();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}