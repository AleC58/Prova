package prjrettangoli;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Punto {

	private double x;
	private double y;

	public Punto() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public Punto(double x, double Y) {
		this.x = x;
		this.y = Y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

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
		final Punto other = (Punto) obj;
		if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
			return false;
		}
		if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Punto{" + "x=" + x + ", y=" + y + '}';
	}

}
