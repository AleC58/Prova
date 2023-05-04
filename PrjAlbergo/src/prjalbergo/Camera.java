package prjalbergo;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Camera extends Stanza {
	private static double scontoPerCamere = 0.10;

	public Camera() {
	}

	public Camera(String nomeStanza, int prezzo, boolean libera) {
		super(nomeStanza, prezzo, libera);
		this.setSconto(scontoPerCamere);
	}

}
