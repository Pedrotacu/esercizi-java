package modificatori_di_accesso.modificatori_public;

// public = LA CLASSE è ACCESSIBILE DA QUALSIASI ALTRA CLASSE

public class Public {

	public static void main(String[] args) {
	    Person myObj = new Person(); 
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	
	
	
}
