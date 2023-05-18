package prjpoligonigrafici;

import java.util.Arrays;

/**
 *
 * @author alex.cazziolato
 */
public abstract class Poligono implements IGrafica, Comparable {
	protected int numLati;
	protected double[] lati;

	//può essere senza costruttori: NON si possono creare oggetti Poligono!
	// ma il costruttore può essere richiamato dalle sottoclassi (con super)
	public Poligono(double[] lati) {
		numLati = lati.length;
		this.lati = new double[numLati];
		for (int j = 0; j< lati.length; j++) {
			this.lati[j] = lati[j];
		}
	}

	public double[] getLati() {
		return lati;
	}

	public int getNumLati() {
		return numLati;
	}

	public double perimetro() {
		double p = 0;
		for (double lato : lati) {
			p += lato;
		}
		return p;
	}

	public abstract double area();

	@Override
	public int hashCode() {
		int hash = 5;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Poligono other = (Poligono) obj;
		if (this.numLati != other.numLati) {
			return false;
		}
		return Arrays.equals(this.lati, other.lati);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "numLati=" + numLati + ", lati=" + Arrays.toString(lati) + '}';
	}

	@Override
	//ordina i poligoni per nome
	public int compareTo(Object o) {
		return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
	}

	@Override
	public void disegna() {
		System.out.println("disegna in Poligono chiamato da " + this.getClass().getSimpleName());
	}

	@Override
	public void zoom() {
		System.out.println("zoom in Poligono chiamato da " + this.getClass().getSimpleName());
	}


}
