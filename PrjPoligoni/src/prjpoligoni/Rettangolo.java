package prjpoligoni;

/**
 *
 * @author alex.cazziolato
 */
public class Rettangolo extends Poligono {
	public Rettangolo(double base, double altezza) {
		//double[] z = new double[]{1.0, 1.0, 1.0, 1.0};
		super(new double[]{base, altezza, base, altezza});
	}

	@Override
	public double area() {
		return lati[0] * lati[1];
	}

}
