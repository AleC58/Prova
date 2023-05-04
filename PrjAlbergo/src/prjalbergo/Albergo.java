package prjalbergo;

import java.util.Arrays;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Albergo {

	private String nome;
	private String indirizzo;
	private int totStanze;
	private Stanza[] stanza;

	public Albergo() {
		nome = "Albergo di default";
		indirizzo = "indirizzo di default";
		totStanze = 5;
		stanza = new Stanza[totStanze];
		stanza[0] = new Camera(101, 50, true);
		stanza[1] = new Camera(102, 50, true);
		stanza[2] = new Camera(103, 50, true);
		stanza[3] = new Appartamento(201, 100, true);
		stanza[4] = new Appartamento(202, 100, true);
	}

	public Albergo(String nome, String indirizzo, Stanza[] stanza) {
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return this.getClass().getSimpleName() + "{" + "nome=" + nome + ", indirizzo=" + indirizzo + ", totStanze=" + totStanze + ", stanza=" + Arrays.deepToString(stanza) + '}';
	}

	public void visStanzeLibere() {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].isLibera()) {
				System.out.println(stanza[j]);
			}
		}
	}

	public void assegnaStanza(int numStanza) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNumero() == numStanza) {
				stanza[j].setLibera(false);
				System.out.println("stanza " + numStanza + " correttamente assegnata");
				return;
			}
		}
		System.out.println("ERRORE: non è stato possibile assegnare la stanza " + numStanza);
	}

	public void liberaStanza(int numStanza, int numGiorniUso) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNumero() == numStanza) {
				if (stanza[j].isLibera()) {
					System.out.println("ERRORE: la stanza " + numStanza + " è già libera");
					return;
				}
				stanza[j].setLibera(true);
				System.out.println("stanza " + numStanza + " liberata");
				System.out.println("Costo giornaliero: " + stanza[j].getPrezzo());
				System.out.println("Giorni di utilizzo: " + numGiorniUso);
				double costoTotaleScontato = (stanza[j].getPrezzo() * numGiorniUso) * (1 - stanza[j].getSconto());
				System.out.println("Costo totale scontato: " + costoTotaleScontato);
				return;
			}
		}
		System.out.println("ERRORE: non è stato possibile liberare la stanza " + numStanza);
	}

	public int ixStanzaDaNumero(int numStanza) {
		for (int j = 0; j < stanza.length; j++) {
			if (stanza[j].getNumero() == numStanza) {
				return j;
			}
		}
		return 0;
	}

}
