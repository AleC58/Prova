package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Appartamento extends Stanza {
	private static double scontoPerAppartamenti = 0.15;

	public Appartamento() {
	}

	public Appartamento(int numero, int prezzo, boolean libera) {
		super(numero, prezzo, libera);
		this.setSconto(scontoPerAppartamenti);
	}


}
