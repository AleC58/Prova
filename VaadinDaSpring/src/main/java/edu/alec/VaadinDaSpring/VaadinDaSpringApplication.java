/*
- generare il progetto da https://start.spring.io/
  Maven / Java / Spring boot 2.1.5
  Nomi: edu.alec / NomeProgetto
  Dep.: DevTools, Vaadin
- estrarre il progetto (da 7zip / Estrai qui)
- aprire il progetto (File / Open project)
- fare Clean and build project per scaricare le dipendenze richieste
- aggiornare la classe principale del progetto (sotto @SpringBootApplication)
  -> DEVE estendere SpringBootServletInitializer
- aggiornare application.properties
- creare la classe MainView (deve avere questo nome)
- eseguire il progetto
NB: se ci sono problemi nella partenza del web container
    cambiare la porta del server in application.properties
    (di default è 8080)
- aprire un browser e portarsi all'url http://localhost:8080/
  (o usare il numero di porta nodificato)
 */
package edu.alec.VaadinDaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VaadinDaSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VaadinDaSpringApplication.class, args);
	}

}
