package edu.alec.F1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
public class C2 implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("\n\nC2 start ****************************");
		AppFileProperties appFileProperties = new AppFileProperties();
		System.out.println("PATH BASE PER FILE CSV: " + appFileProperties.getPathBaseFileCSV());
		System.out.println("FILE PILOTI: " + appFileProperties.getFnPiloti());
		String pathFilePiloti = appFileProperties.getPathBaseFileCSV() + "/" + appFileProperties.getFnPiloti();
		System.out.println("PATH FILE PILOTI: " + pathFilePiloti);
		System.out.println("C2 FINE *****************\n\n");
	}

	@Override
	public void run(String[] args) throws Exception {
		main(args);
	}
}
