package prjrettangoli;

import java.util.Objects;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Rettangolo implements Comparable {
	private Punto vertInfSx;
	private Punto vertSupDx;

	public Rettangolo() {
		this.vertInfSx = new Punto(0.0, 0.0);
		this.vertSupDx = new Punto(0.0, 0.0);
	}

	public Rettangolo(Punto vertInfSx, Punto vertSupDx) {
		this.vertInfSx = vertInfSx;
		this.vertSupDx = vertSupDx;
	}

	public Punto getVertSupDx() {
		return vertSupDx;
	}

	public void setVertSupDx(Punto vertSupDx) {
		this.vertSupDx = vertSupDx;
	}

	public Punto getVertInfSx() {
		return vertInfSx;
	}

	public void setVertInfSx(Punto vertInfSx) {
		this.vertInfSx = vertInfSx;
	}

	@Override
	public int hashCode() {
		int hash = 3;
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
		final Rettangolo other = (Rettangolo) obj;
		if (!Objects.equals(this.vertInfSx, other.vertInfSx)) {
			return false;
		}
		if (!Objects.equals(this.vertSupDx, other.vertSupDx)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Rettangolo{" + "vertInfSx=" + vertInfSx + ", vertSupDx=" + vertSupDx + '}';
	}

	public double area() {
		return 0.0;
	}

//Metodi privati
	private double base() {
		return 0.0;
	}

	private double altezza() {
		return 0.0;
	}

	@Override
	public int compareTo(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}
