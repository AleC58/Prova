package poligoni;

/**
 *
 * @author alex.cazziolato
 */
public class Quadrato extends Poligono {
	public Quadrato(double lato) {
		nome = "Quadrato";
		lati = new double[4];
		numLati = lati.length;
		lati[0] = lato;
		lati[1] = lato;
		lati[2] = lato;
		lati[3] = lato;
	}
	
	@Override
	public double area() {
		return lati[0] * lati[0];
	}
	
}
