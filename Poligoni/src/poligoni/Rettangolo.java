package poligoni;

/**
 *
 * @author alex.cazziolato
 */
public class Rettangolo extends Poligono {
	public Rettangolo(double base, double altezza) {
		nome = "Rettangolo";
		lati = new double[4];
		numLati = lati.length;
		lati[0] = base;
		lati[1] = altezza;
		lati[2] = base;
		lati[3] = altezza;
	}
	
	@Override
	public double area() {
		return lati[0] * lati[1];
	}
	
}
