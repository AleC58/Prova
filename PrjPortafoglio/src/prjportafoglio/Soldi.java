package prjportafoglio;

public class Soldi {

	private static final double[] TAGLI_DELLE_MONETE = {0.5, 1.0, 2.0};
	private static final double[] TAGLI_DELLE_BANCONOTE = {5.0, 10.0, 20.0};

	private double taglio;
	private int qta; //quantità di soldi del taglio dato
	private TipoSoldi tipo;

	public Soldi() {
	}

	public Soldi(double taglio, int qta) {
		if ((!taglioPresente(taglio, TAGLI_DELLE_MONETE)) && (!taglioPresente(taglio, TAGLI_DELLE_BANCONOTE))) {
			System.out.println("Errore creazione " + tipo + ": il taglio " + taglio + " non è valido");
			System.exit(1);
		}
		this.taglio = taglio;
		this.qta = qta;
		this.tipo = (taglioPresente(taglio, TAGLI_DELLE_MONETE)) ? TipoSoldi.MONETE : TipoSoldi.BANCONOTE;
	}

	public double getTaglio() {
		return taglio;
	}

	public void setTaglio(double taglio) {
		this.taglio = taglio;
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

	public static double[] getTAGLI_DELLE_MONETE() {
		return TAGLI_DELLE_MONETE;
	}

	public static double[] getTAGLI_DELLE_BANCONOTE() {
		return TAGLI_DELLE_BANCONOTE;
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
		if (Double.doubleToLongBits(this.taglio) != Double.doubleToLongBits(other.taglio)) {
			return false;
		}
		if (this.tipo != other.tipo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "taglio=" + taglio + ", qta=" + qta + ", tipo=" + tipo + '}';
	}

	public boolean taglioPresente(double taglio, double[] tagliValidi) {
		for (int j = 0; j < tagliValidi.length; j++) {
			if (Double.compare(taglio, tagliValidi[j]) == 0) {
				return true;
			}
		}
		return false;
	}

}
