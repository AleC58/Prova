package prjalbergo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Albergo {

	private String nomeAlbergo;
	private String indirizzo;
	private int totStanze;
	private Stanza[] stanza;

	public Albergo() {
		nomeAlbergo = "Albergo di default";
		indirizzo = "indirizzo di default";
		totStanze = 5;
		stanza = new Stanza[totStanze];
		stanza[0] = new Camera("101", 50, true);
		stanza[1] = new Camera("102", 50, true);
		stanza[2] = new Camera("103", 50, true);
		stanza[3] = new Appartamento("201", 100, true);
		stanza[4] = new Appartamento("202", 100, true);
	}

	public Albergo(String nome, String indirizzo, Stanza[] stanza) {
		this.nomeAlbergo = nome;
		this.indirizzo = indirizzo;
		this.totStanze = stanza.length;
		this.stanza = stanza;
	}

	public Stanza[] getStanza() {
		return stanza;
	}

	public void setStanza(Stanza[] stanza) {
		this.stanza = stanza;
	}

	public String getNomeAlbergo() {
		return nomeAlbergo;
	}

	public void setNomeAlbergo(String nomeAlbergo) {
		this.nomeAlbergo = nomeAlbergo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getTotStanze() {
		return totStanze;
	}

	public void setTotStanze(int totStanze) {
		this.totStanze = totStanze;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "nome=" + nomeAlbergo + ", indirizzo=" + indirizzo + ", totStanze=" + totStanze + ", stanza=" + Arrays.deepToString(stanza) + '}';
	}

	public void visStanzeLibere() {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].isLibera()) {
				System.out.println(stanza[j]);
			}
		}
	}

	public void assegnaStanza(String nomeStanza) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNomeStanza().equals(nomeStanza)) {
				stanza[j].setLibera(false);
				System.out.println("stanza " + nomeStanza + " correttamente assegnata");
				return;
			}
		}
		System.out.println("ERRORE: non è stato possibile assegnare la stanza " + nomeStanza);
	}

	public void liberaStanza(String nomeStanza, int numGiorniUso) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNomeStanza().equals(nomeStanza)) {
				if (stanza[j].isLibera()) {
					System.out.println("ERRORE: la stanza " + nomeStanza + " è già libera");
					return;
				}
				stanza[j].setLibera(true);
				System.out.println("stanza " + nomeStanza + " liberata");
				System.out.println("Costo giornaliero: " + stanza[j].getPrezzo());
				System.out.println("Giorni di utilizzo: " + numGiorniUso);
				double costoTotaleScontato = (stanza[j].getPrezzo() * numGiorniUso) * (1 - stanza[j].getSconto());
				System.out.println("Costo totale scontato: " + costoTotaleScontato);
				return;
			}
		}
		System.out.println("ERRORE: non è stato possibile liberare la stanza " + nomeStanza);
	}

	public void creaDaTastiera() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("\n------------\nCreazione di un nuovo albergo");
		System.out.print("Nome dell'albergo: ");
		//quando si leggono tipi misti usare solamente nextLine()
		nomeAlbergo = tastiera.nextLine();
		System.out.print("Indirizzo dell'albergo: ");
		indirizzo = tastiera.nextLine();
		System.out.print("Numero totale di stanze dell'albergo: ");
		totStanze = Integer.parseInt(tastiera.nextLine());
		stanza = new Stanza[totStanze];
		for (int j = 0; j < totStanze; j++) {
			System.out.println("\n------------\nDati della stanza " + (j + 1) + ": ");
			System.out.print("Nome: ");
			String nomeStanza = tastiera.nextLine();
			System.out.print("Prezzo: ");
			int prezzo = Integer.parseInt(tastiera.nextLine());
			System.out.print("Tipo: (C)amera o (A)ppartamento: ");
			String tipo = tastiera.nextLine();
			if (tipo.equalsIgnoreCase("C")) {
				stanza[j] = new Camera(nomeStanza, prezzo, true);
			} else {
				stanza[j] = new Appartamento(nomeStanza, prezzo, true);
			}
			System.out.println("Stanza " + nomeStanza + " creata");
		}
	}

	public int ixStanzaDaNome(String nomeStanza) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNomeStanza() == nomeStanza) {
				return j;
			}
		}
		return 0;
	}


}
