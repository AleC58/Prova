package prjpoligonigrafici;

/**
 *
 * @author alex.cazziolato
 */
public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato, lato);
	}

	@Override
	public double area() {
		return lati[0] * lati[0];
	}

}
