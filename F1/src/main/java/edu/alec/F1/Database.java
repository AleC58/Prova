package edu.alec.F1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex.cazziolato
 */
public class Database {
	private static Connection connDB = null;
	private final static String driverDB = "";
	private final static String urlDB = "";

	public Database()  {
		try {
			Class.forName(driverDB);
			connDB  = DriverManager.getConnection(urlDB);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Error: impossibile stabilire la connessione al db");
			System.exit(1);
		}
	}

	public static Connection getConnection() {
		if (connDB == null) {
			new Database();
		}
		return connDB;
	}
	
	public static void closeConnection() {
		try {
			connDB.close();
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Error: impossibile chiudere la connessione al db");
			System.exit(1);
		}
	}
}
