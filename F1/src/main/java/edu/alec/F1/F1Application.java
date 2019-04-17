package edu.alec.F1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author alex.cazziolato
 * 
 * Progetto Maven per Spring Boot
 * Dipendenze selezionate: web, dev toole, jdbc
 * Dipendenze aggiunte manualmente nel pom: sqlite
 * 
 * Creata la dir. "dati_csv" con i file csv all'interno di src\main\resources
 * 
 * In application.properties aggiunto:
 * - parametri di connessione al db
 * - porta server Tomcat
 * 
 */

@SpringBootApplication
public class F1Application {

	public static void main(String[] args) {
		SpringApplication.run(F1Application.class, args);
	}

}
