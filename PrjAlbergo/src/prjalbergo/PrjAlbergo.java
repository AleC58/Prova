package prjalbergo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjAlbergo {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int numStanza;
		Albergo albergo = new Albergo();
		System.out.println(albergo);
		int scelta;
		String[] vociMenu = {"Visualizza le camere libere",
			"Assegna una camera", "Libera una camera e mostra il conto"};
		Menu menu = new MenuConControllo("Gestione albergo", vociMenu);
		do {
			//System.out.println(Arrays.deepToString(albergo.getStanza()));
			scelta = menu.getScelta(); //visualizza il menu e legge la scelta
			switch (scelta) {
				case 1:
					albergo.visStanzeLibere();
					break;
				case 2:
					System.out.print("Stanza da assegnare: ");
					numStanza = tastiera.nextInt(); //manca il controllo
					albergo.assegnaStanza(numStanza);
					break;
				case 3:
					System.out.print("Stanza da liberare: ");
					numStanza = tastiera.nextInt(); //manca il controllo
					if (!albergo.getStanza()[albergo.ixStanzaDaNumero(numStanza)].isLibera()) { //se la stanza è occupata
						int giorni;
						System.out.print("Giorni di utilizzo: ");
						giorni = tastiera.nextInt();
						albergo.liberaStanza(numStanza, giorni);
					}
					break;
			}
		} while (scelta != 0);
	}

}
