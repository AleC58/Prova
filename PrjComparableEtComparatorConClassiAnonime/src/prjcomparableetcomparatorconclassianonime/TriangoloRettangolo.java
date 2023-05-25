package prjcomparableetcomparatorconclassianonime;

/**
 *
 * @author alex.cazziolato
 */
public class TriangoloRettangolo extends Poligono {

	public TriangoloRettangolo(double cat1, double cat2) {
		//Math.sqrt(cat1 * cat1 + cat2 * cat2) = ipotenusa
		super(new double[]{cat1, cat2, Math.sqrt(cat1 * cat1 + cat2 * cat2)});
	}

	@Override
	public double area() {
		return lati[0] * lati[1] / 2.0;
	}

}
