package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Camera extends Stanza {
	private static double scontoPerCamere = 0.10;

	public Camera() {
	}

	public Camera(int numero, int prezzo, boolean libera) {
		super(numero, prezzo, libera);
		this.setSconto(scontoPerCamere);
	}

}
