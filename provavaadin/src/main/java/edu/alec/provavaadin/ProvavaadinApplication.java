/*
- generare il progetto da https://start.spring.io/
  Maven / Java / Spring boot 2.1.5
  Nomi: edu.alec / NomeProgetto
  Dep.: DevTools, Vaadin
- estrarre il progetto (da 7zip / Estrai qui)
- aprire il progetto (File / Open project)
- fare Clean and build project
- creare la classe VaadinHello
 */
package edu.alec.provavaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvavaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvavaadinApplication.class, args);
	}

}
