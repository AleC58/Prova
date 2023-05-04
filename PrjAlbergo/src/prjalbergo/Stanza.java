package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Stanza {
	private int numero;
	private int prezzo;
	private boolean libera;
	private double sconto;

	public Stanza() {
	}

	public Stanza(int numero, int prezzo, boolean libera) {
		this.numero = numero;
		this.prezzo = prezzo;
		this.libera = libera;
	}

	public Stanza(int numero, int prezzo, boolean libera, double sconto) {
		this.numero = numero;
		this.prezzo = prezzo;
		this.libera = libera;
		this.sconto = sconto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		return this.getClass().getSimpleName() + "{" + "numero=" + numero + ", prezzo=" + prezzo + ", libera=" + libera + ", sconto=" + sconto + '}';
	}

}
