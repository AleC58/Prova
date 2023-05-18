package poligoni;

/**
 *
 * @author alex.cazziolato
 */
public class TriangoloRettangolo extends Poligono {
	public TriangoloRettangolo(double cat1, double cat2) {
		nome = "Triangolo rettangolo";
		lati = new double[3];
		numLati = lati.length;
		lati[0] = cat1;
		lati[1] = cat2;
		lati[2] = Math.sqrt(cat1 * cat1 + cat2 * cat2); // ipotenusa
	}
	
	@Override
	public double area() {
		return lati[0] * lati[1] / 2.0;
	}
	
}
