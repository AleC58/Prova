/*
- generare il progetto da https://vaadin.com/start/latest/project-base
  Tech stack: Spring boot
  Nomi: edu.alec / ProvaVaadin
- scaricare lo zip ed estrarlo
- aprire il progetto (File / Open project)
- Clean and build project per scaricare le dipendenze
- eseguire il progetto
NB: se ci sono problemi nella partenza del web container
    cambiare la porta del server in application.properties
    (di default è 8080)
- aprire un browser e portarsi all'url http://localhost:8080/
  (o usare il numero di porta nodificato)
 */
package edu.alec.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
