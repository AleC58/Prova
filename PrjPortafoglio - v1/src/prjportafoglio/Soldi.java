package prjportafoglio;

public class Soldi {

	private double valore;
	private int qta; //quantità di soldi del valore dato
	private TipoSoldi tipo;

	public Soldi() {
	}

	public Soldi(double valore, int qta, TipoSoldi tipo) {
		this.valore = valore;
		this.qta = qta;
		this.tipo = tipo;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}

	public TipoSoldi getTipo() {
		return tipo;
	}

	public void setTipo(TipoSoldi tipo) {
		this.tipo = tipo;
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
		final Soldi other = (Soldi) obj;
		if (Double.doubleToLongBits(this.valore) != Double.doubleToLongBits(other.valore)) {
			return false;
		}
		if (this.tipo != other.tipo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +  "{" + "valore=" + valore + ", qta=" + qta + ", tipo=" + tipo + '}';
	}


	public String aatoString() {
		return this.getClass().getSimpleName() + "{" + "valore=" + valore + ", qta=" + qta + '}';
	}

}
