package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Stanza {
	private String nomeStanza;
	private int prezzo;
	private boolean libera;
	private double sconto;

	public Stanza() {
	}

	public Stanza(String nomeStanza, int prezzo, boolean libera) {
		this.nomeStanza = nomeStanza;
		this.prezzo = prezzo;
		this.libera = libera;
	}

	public Stanza(String nomeStanza, int prezzo, boolean libera, double sconto) {
		this.nomeStanza = nomeStanza;
		this.prezzo = prezzo;
		this.libera = libera;
		this.sconto = sconto;
	}

	public String getNomeStanza() {
		return nomeStanza;
	}

	public void setNomeStanza(String nomeStanza) {
		this.nomeStanza = nomeStanza;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isLibera() {
		return libera;
	}

	public void setLibera(boolean libera) {
		this.libera = libera;
	}

	public double getSconto() {
		return sconto;
	}

	public void setSconto(double sconto) {
		this.sconto = sconto;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "nome=" + nomeStanza + ", prezzo=" + prezzo + ", libera=" + libera + ", sconto=" + sconto + '}';
	}

}
