package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Appartamento extends Stanza {
	private static double scontoPerAppartamenti = 0.15;

	public Appartamento() {
	}

	public Appartamento(String nomeStanza, int prezzo, boolean libera) {
		super(nomeStanza, prezzo, libera);
		this.setSconto(scontoPerAppartamenti);
	}


}
