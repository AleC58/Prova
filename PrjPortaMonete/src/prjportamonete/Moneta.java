package prjportamonete;

public class Moneta {
	private double valore;
	private int qta; //quantità di monete del valore dato

	public Moneta(double valore, int qta) {
		this.valore = valore;
		this.qta = qta;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
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
		final Moneta other = (Moneta) obj;
		if (Double.doubleToLongBits(this.valore) != Double.doubleToLongBits(other.valore)) {
			return false;
		}
		if (this.qta != other.qta) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Moneta{" + "valore=" + valore + ", qta=" + qta + '}';
	}
	
	
}
