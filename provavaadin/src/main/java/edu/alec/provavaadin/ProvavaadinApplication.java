/*
- generare il progetto da https://start.spring.io/
  Maven / Java / Spring boot 2.1.5
  Nomi: edu.alec / ProvaVaadin
  Dep.: Vaadin
- importare il progetto (File / Import project / From Zip)
- NB: il progetto ha errori, e non si vede "Source packages"
      -> per risolvere:
  Clean and build project
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
