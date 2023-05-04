package prjalbergo;

import java.util.Scanner;

/**
 *
 * @author Alessandro Cazziolato
 */
public class MenuConControllo extends Menu {

	private int scelta;

	public MenuConControllo(String titolo, String[] vociMenu) {
		super(titolo, vociMenu);
	}

	public int getScelta() {
		Scanner tastiera = new Scanner(System.in);
		boolean sceltaCorretta = false;
		do {
			visualizza();
			scelta = tastiera.nextInt();
			sceltaCorretta = (scelta >= 0) && (scelta <= vociMenu.length - 1);
		}  while (!sceltaCorretta);
		return scelta;
	}

}
