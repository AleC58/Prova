package poligoni;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author alex.cazziolato
 */
public abstract class Poligono {
	protected String nome;
	protected int numLati;
	protected double[] lati;

	public Poligono() {
		this.nome = "";
		this.numLati = 0;
		this.lati = null;
	}

	public Poligono(String nome, double[] lati) {
		this.nome = nome;
		this.numLati = lati.length;
		this.lati = lati;
	}

	public double[] getLati() {
		return lati;
	}

	public String getNome() {
		return nome;
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
		if (!Objects.equals(this.nome, other.nome)) {
			return false;
		}
		return Arrays.equals(this.lati, other.lati);
	}

	@Override
	public String toString() {
		return "Poligono{" + "nome=" + nome + ", numLati=" + numLati + ", lati=" + Arrays.toString(lati) + '}';
	}
	
	

}
