package edu.alec.F1step2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class F1step2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(F1step2Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("START");
	}

}