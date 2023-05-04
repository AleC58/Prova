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
		String nomeStanza;
		Albergo albergo = new Albergo();
		System.out.println(albergo);
		int scelta;
		String[] vociMenu = {"Visualizza le camere libere",
			"Assegna una camera", "Libera una camera e mostra il conto", "Crea albergo da tastiera"};
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
					nomeStanza = tastiera.nextLine(); //manca il controllo
					albergo.assegnaStanza(nomeStanza);
					break;
				case 3:
					System.out.print("Stanza da liberare: ");
					nomeStanza = tastiera.nextLine(); //manca il controllo
					if (!albergo.getStanza()[albergo.ixStanzaDaNome(nomeStanza)].isLibera()) { //se la stanza è occupata
						int giorni;
						System.out.print("Giorni di utilizzo: ");
						giorni = tastiera.nextInt();
						albergo.liberaStanza(nomeStanza, giorni);
					}
					break;
				case 4:
					albergo.creaDaTastiera();
					break;
			}
		} while (scelta != 0);
	}

}
