package MySQL;

import java.sql.*;

public class MyClass {

	public static void main(String[] args) {
	
		try {
			// caricare il driver per il DB
			Class.forName("com.mysql.jdbc.Driver");
			// costruisco la connessione fornendo queste tre informazioni:
			// 1: JDBC connection string (indirizzo, porta, database)
			// 2: username
			// 3: password
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/primodatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","");
			// creo lo statement a partire dalla connessione appena creata
			// lo statement è un oggetto che trasporta i comandi SQL da questo programma Java al DB connesso tramite la connessione conn
			Statement comandoSql = conn.createStatement();
			// invio la query SQL al DB usando statement
			// statement restituirà un ResultSet che rappresenta i dati recuperati al DB
			ResultSet dati = comandoSql.executeQuery("select * from calciatori");
			while(dati.next()) {
				// durante ogni iterazione, accedo ad un record alla volta
				System.out.print(dati.getInt("Id") + " | ");
				System.out.print(dati.getString("nome") + " | ");
				System.out.print(dati.getString("cognome") + " | ");
				System.out.print(dati.getInt("eta") + " | ");
				System.out.print(dati.getString("sesso") + " | ");
				System.out.print(dati.getString("email") + " | ");
				System.out.println(dati.getString("password") + " | ");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
