package edu.alec.F1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
public class C1 implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("\n\nC1 start **********************");
		SpringAppCustomProperties springAppFileProperties = new SpringAppCustomProperties();
		System.out.println("PATH BASE PER FILE CSV: " + springAppFileProperties.getPathBaseFileCSV());
		System.out.println("FILE COSTRUTTORI: " + springAppFileProperties.getFnCostruttori());
		System.out.println("C1 END **********************\n\n");
	}

	@Override
	public void run(String[] args) throws Exception {
		main(args);
	}
}
