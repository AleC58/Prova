package prjpoligonigrafici;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Cerchio extends Poligono {

	public Cerchio(double raggio) {
		super(new double[]{raggio});
	}

	@Override
	public double area() {
		return lati[0] * lati[0] * Math.PI;
	}

	@Override
	public double perimetro() {
		return (lati[0] + lati[0]) * Math.PI;
	}

	@Override
	public void disegna() {
		System.out.println("disegna in Cerchio chiamato da " + this.getClass().getSimpleName());
	}

}
